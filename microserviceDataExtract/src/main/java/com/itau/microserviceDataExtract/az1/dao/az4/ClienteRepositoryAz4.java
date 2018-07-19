package com.itau.microserviceDataExtract.az1.dao.az4;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.itau.microserviceDataExtract.domain.az4.Cliente;

@Repository
public interface ClienteRepositoryAz4 extends CrudRepository<Cliente, Integer> {

}
