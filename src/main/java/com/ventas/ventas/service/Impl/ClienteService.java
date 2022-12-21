package com.ventas.ventas.service.Impl;

import com.ventas.ventas.model.Clientes;
import com.ventas.ventas.repository.IClienteRepository;
import com.ventas.ventas.service.IclienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService implements IclienteService {
    @Autowired
    private IClienteRepository clienteRepository;
    @Override
    public List<Clientes> findAll(){
        return clienteRepository.findAll();
    }

    @Override
    public Optional<Clientes> findById(Long id) {
       return clienteRepository.findById(id);

    }

    @Override
    public Clientes create(Clientes clientes) {
        return clienteRepository.save(clientes);
    }

    @Override
    public Clientes update(Clientes clientes) {
        return clienteRepository.save(clientes);
    }

    @Override
    public void delete(Long id) {
        clienteRepository.deleteById(id);
    }
}
