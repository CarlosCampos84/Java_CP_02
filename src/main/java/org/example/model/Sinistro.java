package org.example.model;

import java.time.LocalDate;

public class Sinistro {

    private int idSinistro;
    private String descricao;
    private LocalDate dataOcorrencia;
    private String status;  // Exemplos: "EM ANÁLISE", "CONCLUÍDO", "NEGADO"

    public Sinistro(int idSinistro, String descricao, LocalDate dataOcorrencia, String status) {
        this.idSinistro = idSinistro;
        this.descricao = descricao;
        this.dataOcorrencia = dataOcorrencia;
        this.status = status;
    }

    public int getIdSinistro() {
        return idSinistro;
    }

    public void setIdSinistro(int idSinistro) {
        this.idSinistro = idSinistro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataOcorrencia() {
        return dataOcorrencia;
    }

    public void setDataOcorrencia(LocalDate dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
