package br.com.sneakstyle.model;

import br.com.sneakstyle.dto.SapatoAtualizaDTO;
import br.com.sneakstyle.dto.SapatoCadastroDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Sapato")
@Table(name="sapatos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Sapato {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String modelo;
    private Integer tamanho;
    private String cor;
    private Double preco;
    private String foto;
    private  Boolean ativo;


    public Sapato(Long id, String marca, String modelo, Integer tamanho, String cor, Double preco, String foto) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.cor = cor;
        this.preco = preco;
        this.foto = foto;
    }

    public Sapato(SapatoCadastroDTO dados) {
        this.marca = dados.marca();
        this.modelo = dados.modelo();
        this.tamanho = dados.tamanho();
        this.cor = dados.cor();
        this.preco = dados.preco();
        this.foto = dados.foto();
        this.ativo = true;
    }


    public void atualizarInformacoes(SapatoAtualizaDTO dados) {
        if(dados.tamanho() != null){
            this.tamanho = dados.tamanho();
        }

        if(dados.cor() != null){
            this.cor = dados.cor();
        }

        if(dados.preco() != null){
            this.preco = dados.preco();
        }

        if(dados.foto() != null){
            this.foto = dados.foto();
        }

    }

    public void deletar(){
        this.ativo = false;
    }
}