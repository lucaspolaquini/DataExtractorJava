package com.itau.microserviceDataExtract.repository.mongo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.itau.microserviceDataExtract.domain.mongo.*;


public interface ClienteRepoMongo  extends MongoRepository<ClienteMongo, Long> {
	
    List<ClienteMongo> findBySegmento(String segmento);


}