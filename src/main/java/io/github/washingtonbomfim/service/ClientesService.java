package io.github.washingtonbomfim.service;

import io.github.washingtonbomfim.model.Cliente;
import io.github.washingtonbomfim.repository.ClientesRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    private ClientesRepository repository;

    public ClientesService(ClientesRepository repository){
        this.repository = repository;

    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){

    }

}
