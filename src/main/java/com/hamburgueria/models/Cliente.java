package com.hamburgueria.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, length = 100)
    private String telefone;

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false,unique = true, length = 100)
    private String email;

    private String endereco;

    @Column(name = "criado_em")
    private LocalDateTime criadoEm = LocalDateTime.now();

    public Cliente() {

    }

    public Cliente(Long id, String nome, String telefone, String senha, String email, String clienteDTOEmail, String endereco) {
    }

    public Cliente(Long id, String nome, String telefone, String senha, String email, String endereco, LocalDateTime criadoEm) {
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
