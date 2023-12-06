package br.com.fujideia.iesp.tecback.model.dto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class TmdbConsultaFilmesDTO {

    private Long id;
    private String title;
    private String overview;

    // getters e setters
}
