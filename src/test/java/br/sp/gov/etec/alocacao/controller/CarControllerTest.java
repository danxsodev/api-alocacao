package br.sp.gov.etec.alocacao.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import br.sp.gov.etec.alocacao.model.Car;

@ExtendWith(SpringExtension.class)
public class CarControllerTest {
	
	@InjectMocks
	CarController controller;
	
	@Test
	public void listCarsTest() {
		List <Car> cars = controller.listCars();
		
		assertNotNull(cars);
		
	}
	
}
