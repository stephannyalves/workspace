package br.com.tch4me.clientems.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document ("Cliente")
public class cliente {
    @Id
    public String Id;
    public String nome;
    public String cpf;
    public String numerocnh;
    public String nascimento;
    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
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
    public String getNumerocnh() {
        return numerocnh;
    }
    public void setNumerocnh(String numerocnh) {
        this.numerocnh = numerocnh;
    }
    public String getNascimento() {
        return nascimento;
    }
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
}
