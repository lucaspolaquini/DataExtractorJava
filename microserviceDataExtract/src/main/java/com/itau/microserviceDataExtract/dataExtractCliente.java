package com.itau.microserviceDataExtract;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.itau.microserviceDataExtract.az1.dao.az1.ClienteRepositoryAz1;

import com.itau.microserviceDataExtract.domain.az1.Cliente;

import com.itau.microserviceDataExtract.domain.mongo.ClienteMongo;
import com.itau.microserviceDataExtract.repository.mongo.ClienteRepoMongo;

@Service
//@EnableScheduling
@EnableAsync
public class dataExtractCliente {
	
	@Autowired
	private ClienteRepositoryAz1 clienteRepositoryAz1;
	
	@Autowired
	private ClienteRepoMongo clienteMongoRepo;

	
//	@Scheduled(initialDelay = 2000, fixedRate = 6000)
	public void run() {	  
	    System.out.println("Current time is :: " + Calendar.getInstance().getTime());
	    try {
	    	extractClienteAz1();    	
	    	
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}
	
	@Async
    public CompletableFuture<Boolean> extractClienteAz1() throws InterruptedException {
        Boolean retorno = false; 
        Iterable<Cliente> listaCliente = clienteRepositoryAz1.findAll();
        
        ArrayList<ClienteMongo> colecao = new ArrayList<ClienteMongo>();
        for (Cliente cliente : listaCliente) {
			ClienteMongo mg = new ClienteMongo();
		    mg.setId(new BigInteger(""+cliente.getId()));
		    mg.setNome(cliente.getNome());
		    mg.setNumeroDocumento(Long.parseLong(cliente.getDocumento()));
		    mg.setSegmento(cliente.getSegmento());
		    colecao.add(mg);
		}
        
        clienteMongoRepo.saveAll(colecao);  
        
        retorno=true;
        return CompletableFuture.completedFuture(retorno);
    }	
	
}
