package org.example.model;

import java.time.LocalDate;

public class Sinistro {

    // Atributos privados da classe
    private int idSinistro;  // Identificador único do sinistro
    private String descricao;  // Descrição detalhada do sinistro
    private LocalDate dataOcorrencia;  // Data da ocorrência do sinistro
    private String status;  // Status do sinistro (Ex.: "EM ANÁLISE", "CONCLUÍDO", "NEGADO")

    // Construtor da classe, usado para inicializar os atributos
    public Sinistro(int idSinistro, String descricao, LocalDate dataOcorrencia, String status) {
        this.idSinistro = idSinistro;  // Define o ID do sinistro
        this.descricao = descricao;  // Define a descrição do sinistro
        this.dataOcorrencia = dataOcorrencia;  // Define a data da ocorrência
        this.status = status;  // Define o status do sinistro
    }

    // Método getter para obter o ID do sinistro
    public int getIdSinistro() {
        return idSinistro;
    }

    // Método setter para atualizar o ID do sinistro
    public void setIdSinistro(int idSinistro) {
        this.idSinistro = idSinistro;
    }

    // Método getter para obter a descrição do sinistro
    public String getDescricao() {
        return descricao;
    }

    // Método setter para atualizar a descrição do sinistro
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Método getter para obter a data da ocorrência do sinistro
    public LocalDate getDataOcorrencia() {
        return dataOcorrencia;
    }

    // Método setter para atualizar a data da ocorrência do sinistro
    public void setDataOcorrencia(LocalDate dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }

    // Método getter para obter o status do sinistro
    public String getStatus() {
        return status;
    }

    // Método setter para atualizar o status do sinistro
    public void setStatus(String status) {
        this.status = status;
    }
}