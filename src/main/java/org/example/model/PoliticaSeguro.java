package org.example.model;

import java.time.LocalDate;

public class PoliticaSeguro {



    private int numeroPolitica;
    private String termos;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private double valorCobertura;

    public PoliticaSeguro(int numeroPolitica, String termos, LocalDate dataInicio, LocalDate dataFim, double valorCobertura) {
        this.numeroPolitica = numeroPolitica;
        this.termos = termos;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valorCobertura = valorCobertura;
    }

    public int getNumeroPolitica() {
        return numeroPolitica;
    }

    public void setNumeroPolitica(int numeroPolitica) {
        this.numeroPolitica = numeroPolitica;
    }

    public String getTermos() {
        return termos;
    }

    public void setTermos(String termos) {
        this.termos = termos;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public double getValorCobertura() {
        return valorCobertura;
    }

    public void setValorCobertura(double valorCobertura) {
        this.valorCobertura = valorCobertura;
    }


}
