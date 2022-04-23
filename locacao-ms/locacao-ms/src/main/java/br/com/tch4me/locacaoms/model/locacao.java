package br.com.tch4me.locacaoms.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document ("locacao")

public class locacao {
    @Id
    
    public String idlocacao;
    public String idveiculo;
    public String idcliente;
    public int diasdelocacao;
    public String getIdlocacao() {
        return idlocacao;
    }
    public void setIdlocacao(String idlocacao) {
        this.idlocacao = idlocacao;
    }
    public String getIdveiculo() {
        return idveiculo;
    }
    public void setIdveiculo(String idveiculo) {
        this.idveiculo = idveiculo;
    }
    public String getIdcliente() {
        return idcliente;
    }
    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }
    public int getDiasdelocacao() {
        return diasdelocacao;
    }
    public void setDiasdelocacao(int diasdelocacao) {
        this.diasdelocacao = diasdelocacao;
    }
    }
    
    