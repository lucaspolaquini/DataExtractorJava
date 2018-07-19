package com.itau.microserviceDataExtract.az1.dao.az3;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.itau.microserviceDataExtract.domain.az3.Movimentacao;

@Repository
public interface MovimentacaoRepositoryAz3 extends CrudRepository<Movimentacao, Integer> {

}
