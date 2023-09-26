package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "tb_cartao")
public class Cartao implements Serializable {

    @Id
    @GeneratedValue
    private Integer numeroDoCartao;

    private LocalDate dataDeValidade;

    private Integer cvv;

    private String nomeDoTitular;

    private Integer cpf;

    @ManyToOne
    private Usuario usuario;
}
