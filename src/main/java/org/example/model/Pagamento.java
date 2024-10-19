package org.example.model;

import java.time.LocalDate;

public class Pagamento {
    private int idPagamento;
    private double valor;
    private LocalDate dataPagamento;
    private String status;  // Exemplos: "PAGO", "PENDENTE", "ATRASADO"

    public Pagamento(int idPagamento, double valor, LocalDate dataPagamento, String status) {
        this.idPagamento = idPagamento;
        this.valor = valor;
        this.dataPagamento = dataPagamento;
        this.status = status;
    }

    public int getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
