package br.sp.gov.etec.alocacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
	
}
	
