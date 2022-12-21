package com.ventas.ventas.controller;

import com.ventas.ventas.model.Clientes;
import com.ventas.ventas.service.Impl.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<Clientes>> findAll(){
        return ResponseEntity.ok(clienteService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Clientes> findById(@PathVariable("id") Long id){
        return clienteService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());

    }

    @PostMapping
    public ResponseEntity<Clientes> create(@RequestBody Clientes clientes){
        return new ResponseEntity<>(clienteService.create(clientes), HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity<Clientes> update (@RequestBody Clientes clientes){
        return clienteService.findById(clientes.getIdcliente())
                .map(c -> ResponseEntity.ok(clienteService.update(clientes)))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Clientes> delete(@PathVariable Long id){
        return clienteService.findById(id)
                .map(c -> {
                    clienteService.delete(id);
                    return ResponseEntity.ok(c);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

}
