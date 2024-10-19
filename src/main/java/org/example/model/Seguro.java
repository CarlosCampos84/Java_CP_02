package org.example.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Seguro {
    private Cliente cliente;
    private double valor;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private double valorBase;

    public Seguro(Cliente cliente, double valorBase, LocalDate dataInicio, LocalDate dataFim) {
        this.cliente = cliente;
        this.valorBase = valorBase;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valor = calcularValorTotal();
    }

    // Verifica se o seguro é válido com base na data
    public boolean isValido() {
        LocalDate hoje = LocalDate.now();
        return hoje.isAfter(dataInicio) && hoje.isBefore(dataFim.plusDays(1));
    }

    // Calcula o valor total do seguro com base em fatores como duração do seguro
    // Aplicar desconto de longo prazo ou outros fatores
    private double calcularValorTotal() {
        long dias = ChronoUnit.DAYS.between(dataInicio, dataFim);
        return valorBase * (1 - calcularDesconto(dias));
    }

    // Método para calcular desconto baseado na duração do seguro
    private double calcularDesconto(long dias) {
        if (dias > 365) { // mais de um ano
            return 0.10; // 10% de desconto
        }
        return 0;
    }

    // Método para extender a duração do seguro
    public void extenderSeguro(long diasAdicionais) {
        this.dataFim = dataFim.plusDays(diasAdicionais);
        this.valor = calcularValorTotal(); // Recalcular o valor após extensão
    }

    public double getValor() {
        return valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
        this.valor = calcularValorTotal();
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
        this.valor = calcularValorTotal();
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
        this.valor = calcularValorTotal();
    }

}
