package br.com.tch4me.locacaoms.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document ("tipodeveiculo")

public class tipodeveiculo {
    @Id
    public String id;
    public String marca;
    public String modelo;
    public String numeropassageiros;
    public Double valorlocacaodia;
    public String tipodecombustivel;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getNumeropassageiros() {
        return numeropassageiros;
    }
    public void setNumeropassageiros(String numeropassageiros) {
        this.numeropassageiros = numeropassageiros;
    }
    public Double getValorlocacaodia() {
        return valorlocacaodia;
    }
    public void setValorlocacaodia(Double valorlocacaodia) {
        this.valorlocacaodia = valorlocacaodia;
    }
    public String getTipodecombustivel() {
        return tipodecombustivel;
    }
    public void setTipodecombustivel(String tipodecombustivel) {
        this.tipodecombustivel = tipodecombustivel;
    }

    
}
