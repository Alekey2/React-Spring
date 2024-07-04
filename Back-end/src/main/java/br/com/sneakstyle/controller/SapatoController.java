package br.com.sneakstyle.controller;

import br.com.sneakstyle.dto.SapatoAtualizaDTO;
import br.com.sneakstyle.dto.SapatoCadastroDTO;
import br.com.sneakstyle.dto.SapatoDetalhaesDTO;
import br.com.sneakstyle.dto.SapatoListaDTO;
import br.com.sneakstyle.model.Sapato;
import br.com.sneakstyle.repository.SapatoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/sapatos")
public class SapatoController {

    @Autowired
    private SapatoRepository repositorio;


    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid SapatoCadastroDTO dados, UriComponentsBuilder uriBuilder) {
        var sapato = new Sapato(dados);
        repositorio.save(sapato);

        var uri = uriBuilder.path("/sapatos/{id}").buildAndExpand(sapato.getId()).toUri();
        return ResponseEntity.created(uri).body(new SapatoDetalhaesDTO(sapato));
    }

    @GetMapping
    public ResponseEntity<Page<SapatoListaDTO>> listagem(@PageableDefault(size = 10, sort = {"marca"}) Pageable pagina) {
        var page = repositorio.findAllByAtivoTrue(pagina).map(SapatoListaDTO::new);
        return ResponseEntity.ok(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity detalhar(@PathVariable Long id){
        var medico = repositorio.getReferenceById(id);
        return ResponseEntity.ok(new SapatoDetalhaesDTO(medico));
    }


    @PutMapping
    @Transactional
    public ResponseEntity atualizar(@RequestBody @Valid SapatoAtualizaDTO dados) {
        var sapato = repositorio.getReferenceById(dados.id());
        sapato.atualizarInformacoes(dados);

        return ResponseEntity.ok(new SapatoDetalhaesDTO(sapato));

    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity deletar(@PathVariable Long id){
        var sapato = repositorio.getReferenceById(id);
        sapato.deletar();
        return ResponseEntity.noContent().build();
    }
}




