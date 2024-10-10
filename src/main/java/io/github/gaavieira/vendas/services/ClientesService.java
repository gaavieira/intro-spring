package io.github.gaavieira.vendas.services;

import io.github.gaavieira.vendas.model.Cliente;
import io.github.gaavieira.vendas.repositories.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClientesService {

    private ClientesRepository clienteRepository;

    @Autowired
    public ClientesService(ClientesRepository clientesRepository) {
        this.clienteRepository = clientesRepository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.clienteRepository.persistir(cliente);

    }
    public void validarCliente(Cliente cliente){}

}
