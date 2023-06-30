package br.sp.gov.etec.alocacao.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import br.sp.gov.etec.alocacao.model.Client;
import br.sp.gov.etec.alocacao.repository.ClientRepository;

@ExtendWith(SpringExtension.class)
public class ClientControllerTest {

	@InjectMocks
	ClientController controller;
	
	@Mock
	ClientRepository repository;
	
	@Test
	public void testClients() {
		when(repository.findAll()).thenReturn(getListClient());
		List<Client> client = controller.listClient();
		assertNotNull(client);
		assertEquals("Francisco", client.get(0).getName());
	}
	
	private ArrayList<Client> getListClient(){
		Client client = new Client();
		client.setName("Francisco");
		client.setCpf("123.321.213-31");
		client.setMail("francisco@gmail.com");
		client.setPhone("(11)96738-2612");
		client.setId(1L);
		
		ArrayList<Client> list = new ArrayList<Client>();
		list.add(client);
		return list;
	}
	
}
