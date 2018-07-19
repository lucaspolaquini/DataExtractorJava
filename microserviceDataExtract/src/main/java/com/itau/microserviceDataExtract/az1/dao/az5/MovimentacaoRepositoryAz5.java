package com.itau.microserviceDataExtract.az1.dao.az5;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.itau.microserviceDataExtract.domain.az5.Movimentacao;

@Repository
public interface MovimentacaoRepositoryAz5 extends CrudRepository<Movimentacao, Integer> {

}
