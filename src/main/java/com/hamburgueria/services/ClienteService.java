package com.hamburgueria.services;

import com.hamburgueria.hamburgueria_api.Repositoriees.ClienteRepository;
import com.hamburgueria.hamburgueria_api.dtos.ClienteDTO;
import com.hamburgueria.hamburgueria_api.exceptions.BussinesException;
import com.hamburgueria.hamburgueria_api.models.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    private static final String MSG_AGENDAMENTO = "Agendamento não encontrado";

    @Autowired
    private ClienteRepository clienteRepository;

    public  ClienteDTO converterClienteParaClienteDTO(Cliente cliente) {
        ClienteDTO clienteDTO = new ClienteDTO(
                cliente.getId(),
                cliente.getNome(),
                cliente.getTelefone(),
                cliente.getSenha(),
                cliente.getEmail(),
                cliente.getEndereco(),
                cliente.getCriadoEm());
        return clienteDTO;
    }
    public Cliente converterClienteDTOParaCliente(ClienteDTO clienteDTO) {
        Cliente cliente = new Cliente(
                clienteDTO.getId(),
                clienteDTO.getNome(),
                clienteDTO.getTelefone(),
                clienteDTO.getSenha(),
                clienteDTO.getEmail(),
                clienteDTO.getEmail(),
                clienteDTO.getEndereco());
        return cliente;
    }
    public ClienteDTO cadastrarCliente(ClienteDTO clienteDTO) {
        Cliente cliente = converterClienteDTOParaCliente(clienteDTO);
        cliente = clienteRepository.save(cliente);
        return converterClienteParaClienteDTO(cliente);
    }

    public ClienteDTO atualizarCliente(ClienteDTO clienteDTO) {
        clienteRepository.findById(clienteDTO.getId())
                .orElseThrow(() -> new BussinesException(MSG_AGENDAMENTO));

        Cliente cliente = converterClienteDTOParaCliente(clienteDTO);
        clienteRepository.save(cliente);
        return converterClienteParaClienteDTO(cliente);
    }

    public List<ClienteDTO> buscarTodosClientes() {
        List<Cliente> clientes = clienteRepository.findAll();
        List<ClienteDTO> clienteDTOs = new ArrayList<>();
        for (Cliente cliente : clientes) {
            clienteDTOs.add(converterClienteParaClienteDTO(cliente));
        }
        return clienteDTOs;
    }

    public ClienteDTO buscarClientePorId(Long id) {
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new BussinesException(MSG_AGENDAMENTO));
        return converterClienteParaClienteDTO(cliente);
    }
    public ClienteDTO buscarClientePorNome(String nome) {
        Cliente cliente = clienteRepository.findByNome(nome)
                .orElseThrow(() -> new BussinesException(MSG_AGENDAMENTO));
        return converterClienteParaClienteDTO(cliente);
    }
    public void deletarCliente(Long id) {
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new BussinesException(MSG_AGENDAMENTO));
        clienteRepository.delete(cliente);
    }
}