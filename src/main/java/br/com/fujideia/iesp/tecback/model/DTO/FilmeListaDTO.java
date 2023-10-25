package br.com.fujideia.iesp.tecback.model.DTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class FilmeListaDTO {

    private String nome;

    private String nomeGenero;
}
