package com.hamburgueria.Controllers;

import com.hamburgueria.hamburgueria_api.dtos.ClienteDTO;
import com.hamburgueria.hamburgueria_api.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<ClienteDTO>> buscarTodosClientes(){
        return ResponseEntity.ok(clienteService.buscarTodosClientes());
    }
    @GetMapping("/{id}")
    public ResponseEntity<ClienteDTO> buscarClientePorId(@PathVariable Long id){
        return ResponseEntity.ok(clienteService.buscarClientePorId(id));
    }
    @GetMapping("/nome")
    public ResponseEntity<ClienteDTO> buscarClientePorNome(@RequestParam String nome){
        return ResponseEntity.ok(clienteService.buscarClientePorNome(nome));
    }
    @PostMapping()
    public  ResponseEntity<ClienteDTO> cadastrarCliente(@RequestBody ClienteDTO clienteDTO) {
        ClienteDTO cliente = clienteService.cadastrarCliente(clienteDTO);
        return ResponseEntity.ok(cliente);
    }

    @PutMapping()
    public ResponseEntity<ClienteDTO> atualizarCliente(@RequestBody ClienteDTO clienteDTO) {
        return ResponseEntity.ok(clienteService.atualizarCliente(clienteDTO));
    }
    @DeleteMapping()
    public ResponseEntity<Void> deletarCliente(@RequestBody ClienteDTO clienteDTO) {
        clienteService.deletarCliente(clienteDTO.getId());
        return ResponseEntity.noContent().build();
    }
}
