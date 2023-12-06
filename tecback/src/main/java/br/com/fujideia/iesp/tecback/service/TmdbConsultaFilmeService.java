package br.com.fujideia.iesp.tecback.service;
import br.com.fujideia.iesp.tecback.model.Filme;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TmdbConsultaFilmeService implements ConsultaFilmeService {

    @Value("${tmdb.apiKey}")
    private String apiKey;

    private final String BASE_URL = "https://api.themoviedb.org/3";
    private final RestTemplate restTemplate;

    public TmdbConsultaFilmeService(RestTemplate restTemplate) {

        this.restTemplate = restTemplate;
    }

    @Override
    public Filme buscarDetalhesFilmePorId(Long id) {
        String url = BASE_URL + "/movie/" + id + "?api_key=" + apiKey;
        return restTemplate.getForObject(url, Filme.class);
    }

    // Implementação de outros métodos para a API do TMDb...
}
