package com.itau.microserviceDataExtract;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.itau.microserviceDataExtract.az1.dao.az3.MovimentacaoRepositoryAz3;

import com.itau.microserviceDataExtract.domain.az3.Movimentacao;
import com.itau.microserviceDataExtract.domain.mongo.AtivoMongo;

import com.itau.microserviceDataExtract.repository.mongo.AtivoRepoMongo;


@Service
@EnableScheduling
@EnableAsync
public class dataExtractAz3 {
	
	
	@Autowired
	private MovimentacaoRepositoryAz3 movimentacaoAz3;
	
	
	@Autowired
	private AtivoRepoMongo ativoMongoRepo;
	
	@Scheduled(initialDelay = 500, fixedRate = 5000)
	public void run() {	  
	    System.out.println("Current time is :: " + Calendar.getInstance().getTime());
	    try {	    	   	
	    	extractAtivoAz3();	    	
	    	
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}
	
   
	@Async
    public CompletableFuture<Boolean> extractAtivoAz3() throws InterruptedException {
        Boolean retorno = false; 
        Iterable<Movimentacao> listaMovAz3 = movimentacaoAz3.findAll();
        
        ArrayList<AtivoMongo> colecao = new ArrayList<AtivoMongo>();
        for (Movimentacao mov : listaMovAz3) {
			AtivoMongo at = new AtivoMongo();
			
			at.setId(mov.getAtivo().getCod_ativo());
			at.setIdCliente(Long.parseLong(""+mov.getId_Cliente()));
			at.setIdMov(Long.parseLong(""+mov.getId()));
			at.setTipoMov(mov.getTipo_C_V());
			at.setQuantidade(mov.getQtde());
			at.setValor(mov.getValorOperacao());
			at.setNomePlataforma(mov.getAtivo().getPlataforma());
			at.setNomeAtivo(mov.getAtivo().getNomeAtivo());
			at.setNome(mov.getCliente().getNome());
			at.setNumeroDocumento(Long.parseLong(""+mov.getCliente().getDocumento()));
		    colecao.add(at);
		}
        
        ativoMongoRepo.saveAll(colecao);
      
        return CompletableFuture.completedFuture(retorno);
    }
	
}
