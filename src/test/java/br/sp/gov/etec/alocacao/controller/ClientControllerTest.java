package br.sp.gov.etec.alocacao.controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import br.sp.gov.etec.alocacao.model.Client;

@ExtendWith(SpringExtension.class)
public class ClientControllerTest {

	@InjectMocks
	ClientController controller;
	
	@Test
	public void listClientTest( ) {
		List <Client> clients = controller.listClient();
		
		assertNotNull(clients);
		
	}
	
}
