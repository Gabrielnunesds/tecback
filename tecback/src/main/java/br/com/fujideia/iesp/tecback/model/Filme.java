package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "tb_filme")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Filme implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    private String titulo;
    @Column(name = "ds_sinopse", length = 500)
    private String sinopse;

    private Integer ano;

    @ManyToOne
    private Genero genero;
}
