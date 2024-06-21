package br.com.sneakstyle.dto;

public record SapatoDTO(
        String marca,
        String modelo,
        Integer tamanho,
        String cor,
        Double preco,
        String foto
) {
}
