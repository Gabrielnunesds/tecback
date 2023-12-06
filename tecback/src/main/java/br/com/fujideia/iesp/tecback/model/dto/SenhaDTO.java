package br.com.fujideia.iesp.tecback.model.dto;
import br.com.fujideia.iesp.tecback.validator.SenhaValida;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Builder
public class SenhaDTO {

    @SenhaValida
    private String senha;

    // getters e setters
}

