package br.com.fujideia.iesp.tecback.model.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;
import java.time.LocalDate;

@Data
@Builder

public class CartaoDTO {

    private Integer id;
    @NotEmpty
    private Integer numeroDoCartao;
    private LocalDate dataDeValidade;
    private String nomeDoTitular;
    private Integer cpf;
}
