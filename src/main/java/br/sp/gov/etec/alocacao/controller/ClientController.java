package br.sp.gov.etec.alocacao.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.sp.gov.etec.alocacao.model.Car;
import br.sp.gov.etec.alocacao.model.Client;

@RestController
public class ClientController {
	
	@GetMapping("listar-clientes")
	public List<Client> listClient() {
		Client client1 = new Client();
		client1.setId(1L);
		client1.setName("Andreia");
		client1.setCpf("404.612.100-96");
		client1.setPhone("(13)3825-4065");
		client1.setMail("andreia731@gmail.com");
		
		
		Client client2 = new Client();
		client2.setId(2L);
		client2.setName("Lucas");
		client2.setCpf("404.632.150-54");
		client2.setPhone("(11)3925-5342");
		client2.setMail("lucas181@gmail.com");
		
		List clients = new ArrayList<Client> ();
		clients.add(client1);
		clients.add(client2);
		return clients;
	}
	
}
	
