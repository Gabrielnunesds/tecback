package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Cartao;
import br.com.fujideia.iesp.tecback.repository.CartaoRepository;
import jakarta.ws.rs.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartaoService {

    @Autowired
    private CartaoRepository repository;

    public Cartao salvar(Cartao cartao){
        return repository.save(cartao);
    }

    public List<Cartao> listar(){
        return repository.findAll();
    }

    public Cartao consultarPorId(Integer id){
        return repository
                .findById(id)
                .orElseThrow(NotFoundException::new);
    }

    public void excluir(int id){
        repository.deleteById(id);
    }
}
