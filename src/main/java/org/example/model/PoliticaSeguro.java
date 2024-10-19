package org.example.model;

import java.time.LocalDate;



public class PoliticaSeguro {

    // Atributos privados da classe
    private int numeroPolitica;  // Número da política de seguro
    private String termos;  // Termos e condições da política de seguro
    private LocalDate dataInicio;  // Data de início da política de seguro
    private LocalDate dataFim;  // Data de término da política de seguro
    private double valorCobertura;  // Valor de cobertura da política de seguro

    // Construtor da classe, usado para inicializar os atributos
    public PoliticaSeguro(int numeroPolitica, String termos, LocalDate dataInicio, LocalDate dataFim, double valorCobertura) {
        this.numeroPolitica = numeroPolitica;  // Define o número da política de seguro
        this.termos = termos;  // Define os termos da política de seguro
        this.dataInicio = dataInicio;  // Define a data de início
        this.dataFim = dataFim;  // Define a data de término
        this.valorCobertura = valorCobertura;  // Define o valor de cobertura
    }

    // Método getter para obter o número da política
    public int getNumeroPolitica() {
        return numeroPolitica;
    }

    // Método setter para atualizar o número da política
    public void setNumeroPolitica(int numeroPolitica) {
        this.numeroPolitica = numeroPolitica;
    }

    // Método getter para obter os termos da política
    public String getTermos() {
        return termos;
    }

    // Método setter para atualizar os termos da política
    public void setTermos(String termos) {
        this.termos = termos;
    }

    // Método getter para obter a data de início da política
    public LocalDate getDataInicio() {
        return dataInicio;
    }

    // Método setter para atualizar a data de início da política
    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    // Método getter para obter a data de término da política
    public LocalDate getDataFim() {
        return dataFim;
    }

    // Método setter para atualizar a data de término da política
    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    // Método getter para obter o valor de cobertura da política
    public double getValorCobertura() {
        return valorCobertura;
    }

    // Método setter para atualizar o valor de cobertura da política
    public void setValorCobertura(double valorCobertura) {
        this.valorCobertura = valorCobertura;
    }
}
