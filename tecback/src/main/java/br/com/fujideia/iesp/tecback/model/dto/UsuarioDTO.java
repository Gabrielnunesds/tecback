package br.com.fujideia.iesp.tecback.model.dto;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuarioDTO {

    private Integer id;
    @NotEmpty
    private String nome;
    private String email;
}
