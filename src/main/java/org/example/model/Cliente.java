package org.example.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cliente {
    private String nome;
    private String cpf;
    private List<Seguro> seguros;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.seguros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Adiciona um seguro ao cliente
    public void adicionarSeguro(Seguro seguro) {
        this.seguros.add(seguro);
    }

    public void removerSeguro(Seguro seguro) {
        this.seguros.remove(seguro);
    }

    // Retorna todos os seguros válidos
    public List<Seguro> getSegurosValidos() {
        return seguros.stream().filter(Seguro::isValido).collect(Collectors.toList());
    }

    public List<Seguro> buscarSegurosPorValorMinimo(double valorMinimo) {
        return seguros.stream().filter(s -> s.getValor() >= valorMinimo).collect(Collectors.toList());
    }

    public List<Seguro> listarTodosSeguros() {
        return new ArrayList<>(seguros);
    }
}
