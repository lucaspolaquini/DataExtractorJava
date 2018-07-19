package com.itau.microserviceDataExtract.az1.dao.az4;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.itau.microserviceDataExtract.domain.az4.Movimentacao;

@Repository
public interface MovimentacaoRepositoryAz4 extends CrudRepository<Movimentacao, Integer> {

}
