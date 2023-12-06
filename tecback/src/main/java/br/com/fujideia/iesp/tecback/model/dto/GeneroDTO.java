package br.com.fujideia.iesp.tecback.model.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class GeneroDTO {

    private Integer id;
    @NotEmpty
    private String nome;
}
