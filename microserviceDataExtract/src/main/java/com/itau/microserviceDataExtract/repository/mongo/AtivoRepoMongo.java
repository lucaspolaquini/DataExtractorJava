package com.itau.microserviceDataExtract.repository.mongo;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.itau.microserviceDataExtract.domain.mongo.*;


public interface AtivoRepoMongo  extends MongoRepository<AtivoMongo, Long> {


}