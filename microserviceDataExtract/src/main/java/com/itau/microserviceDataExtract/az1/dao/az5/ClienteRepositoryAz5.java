package com.itau.microserviceDataExtract.az1.dao.az5;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.itau.microserviceDataExtract.domain.az5.Cliente;

@Repository
public interface ClienteRepositoryAz5 extends CrudRepository<Cliente, Integer> {

}
