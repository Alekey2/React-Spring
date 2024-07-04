package br.com.sneakstyle.dto;

import br.com.sneakstyle.model.Sapato;

public record SapatoDetalhaesDTO(
         Long id,
         String marca,
         String modelo,
         Integer tamanho,
         String cor,
         Double preco,
         String foto
) {
    public SapatoDetalhaesDTO (Sapato sapato){
        this(sapato.getId(), sapato.getMarca(), sapato.getModelo(), sapato.getTamanho(), sapato.getCor(), sapato.getPreco(), sapato.getFoto());
    }

}
