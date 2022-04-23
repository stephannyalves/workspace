package br.com.tch4me.locacaoms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tch4me.locacaoms.model.locacao;

public interface repository extends MongoRepository< locacao, String >  {
    
}
