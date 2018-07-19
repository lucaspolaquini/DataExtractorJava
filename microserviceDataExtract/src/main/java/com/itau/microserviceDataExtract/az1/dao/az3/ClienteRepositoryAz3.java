package com.itau.microserviceDataExtract.az1.dao.az3;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.itau.microserviceDataExtract.domain.az3.Cliente;

@Repository
public interface ClienteRepositoryAz3 extends CrudRepository<Cliente, Integer> {

}
