package com.adv.cadastro.service;

import com.adv.cadastro.entity.ClienteEntity;
import com.adv.cadastro.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    ClienteRepository repository;

    @Override
    public String cadastrar(ClienteEntity cliente) {
        repository.save(cliente);
        Optional <ClienteEntity> clienteEntityOptional = repository.findById(cliente.getId());
        List<Long> idCliente = clienteEntityOptional.stream().map(ClienteEntity::getId).toList();

        return idCliente.toString();
    }

    @Override
    public Optional<Iterable<ClienteEntity>> listarTodos() {
        Optional<Iterable<ClienteEntity>> clientes = Optional.of(repository.findAll());
        return clientes;
    }

    @Override
    public Optional<ClienteEntity> findCliente(Optional id) {
        Optional <ClienteEntity> clienteEntityOptional = repository.findById((Long) id.get());
        return clienteEntityOptional;
    }
}
