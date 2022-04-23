package br.com.tch4me.clientems.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tch4me.clientems.model.cliente;

public interface repository extends MongoRepository < cliente, String> {

}

