package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Genero;
import br.com.fujideia.iesp.tecback.repository.GeneroRepository;
import jakarta.ws.rs.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroService {
    @Autowired
    private GeneroRepository repository;

    public Genero salvar(Genero genero){
        return repository.save(genero);
    }

    public List<Genero> listar(){
        return repository.findAll();
    }

    public Genero consultarPorId(Integer id){
        return repository
                .findById(id)
                .orElseThrow(NotFoundException::new);
    }

    public void excluir(int id){
        repository.deleteById(id);
    }

}