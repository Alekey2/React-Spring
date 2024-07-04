package br.com.sneakstyle.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record SapatoCadastroDTO(
        @NotBlank
        String marca,

        @NotBlank
        String modelo,

        @NotNull
        Integer tamanho,

        @NotBlank
        String cor,

        @NotNull
        Double preco,

        @NotBlank
        String foto
) {

}
