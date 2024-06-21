package br.com.sneakstyle.controller;

import br.com.sneakstyle.dto.SapatoDTO;
import br.com.sneakstyle.model.Sapato;
import br.com.sneakstyle.service.SapatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class SapatoController {

    @Autowired
    private SapatoService servico;


    @GetMapping("/produto")
    public SapatoDTO obterTodosSapatos(Long id){
        return servico.obterTodosSapatos(id);
    }


}


