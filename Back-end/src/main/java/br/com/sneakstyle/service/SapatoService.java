package br.com.sneakstyle.service;

import br.com.sneakstyle.dto.SapatoDTO;
import br.com.sneakstyle.model.Sapato;
import br.com.sneakstyle.repository.SapatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SapatoService {

    @Autowired
    private SapatoRepository repositorio;


    public SapatoDTO obterTodosSapatos(Long id) {
        Sapato s = repositorio.findById(1L).get();
        return new SapatoDTO(s.getMarca(),s.getModelo(),s.getTamanho(), s.getCor(), s.getPreco(), s.getFoto());
    }


}
