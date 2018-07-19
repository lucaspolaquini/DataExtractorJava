package com.itau.microserviceDataExtract.az1.dao.az1;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.itau.microserviceDataExtract.domain.az1.Movimentacao;

@Repository
public interface MovimentacaoRepositoryAz1 extends CrudRepository<Movimentacao, Integer> {

}
