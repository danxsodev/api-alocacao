package br.sp.gov.etec.alocacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.sp.gov.etec.alocacao.model.Car;
import br.sp.gov.etec.alocacao.model.Client;
import br.sp.gov.etec.alocacao.repository.ClientRepository;
import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;

@RestController
public class ClientController {
	
	@SuppressWarnings("unchecked")
	
	@Autowired
	ClientRepository repository;
	
	@GetMapping("listar-clientes")
	public List<Client> listClient() {
		return repository.findAll();
	}
	
    @PostMapping("adicionar-cliente")
    public Client insertClient(@RequestBody Client client) {
    	return repository.save(client);
    }
    
	 @PutMapping("atualizar-cliente")
	    public Client updateClient(@RequestBody Client client) {
		 	return repository.save(client); 		 
	 }

	@DeleteMapping("deletar-cliente/{id}")
		public ResponseEntity deleteClient(@PathVariable long id) {
			repository.deleteById(id);
			return new ResponseEntity<>(HttpStatusCode.valueOf(200));
	}
				
}
	
