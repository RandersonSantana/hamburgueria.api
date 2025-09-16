package com.hamburgueria.dtos;

import java.time.LocalDateTime;


public class ClienteDTO {
    private Long id;
    private String nome;
    private String telefone;
    private String senha;
    private String email;
    private String endereco;
    private LocalDateTime criadoEm = LocalDateTime.now();

    public ClienteDTO() {
    }

    public ClienteDTO(Long id, String nome, String telefone, String senha, String email, String endereco, LocalDateTime criadoEm) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.senha = senha;
        this.email = email;
        this.endereco = endereco;
        this.criadoEm = criadoEm;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }
}
