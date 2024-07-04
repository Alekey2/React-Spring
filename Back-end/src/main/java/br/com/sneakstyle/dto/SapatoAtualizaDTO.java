package br.com.sneakstyle.dto;

import jakarta.validation.constraints.NotNull;

public record SapatoAtualizaDTO(
        @NotNull
        Long id,
        Integer tamanho,
        String cor,
        Double preco,
        String foto
) {

}
