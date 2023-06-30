package br.sp.gov.etec.alocacao.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import br.sp.gov.etec.alocacao.repository.CarRepository;
import br.sp.gov.etec.alocacao.model.Car;

@ExtendWith(SpringExtension.class)
public class CarControllerTest {
	
	@InjectMocks
	CarController controller;
	
	@Mock
	CarRepository repository;
	
	@Mock 
	List<Car> listCars;
	
	@Mock
	Car car;
	
	@Test
	public void testListCars() {
		when(repository.findAll()).thenReturn(listCars);
		 List<Car> cars = controller.listCars();
		 assertNotNull(cars);
	}
	
	@Test
	public void testeNull() {
		when(repository.findAll()).thenReturn(null);
		 List<Car> cars = controller.listCars();
		 assertNull(cars);
	}
	
	@Test
	public void testAddCarSucess() {
		when(repository.save(any(Car.class))).thenReturn(getCar());
		Car car = controller.updateCar(new Car("Fusca","Branco", "ABC123", 1234L));
		assertEquals("Fusca", car.getModel());
		assertEquals("Branco", car.getColor());
		assertEquals("ABC123", car.getLicensePlate());
		assertEquals(1234L, car.getChassi());
		assertEquals(1L, car.getId());
		
	}
	
	@Test
	public void testUpdateCarSucess() {
		when(repository.save(any(Car.class))).thenReturn(getCar());
		Car car = controller.updateCar(getCar());
		assertEquals("Fusca", car.getModel());
	
	}
	
	@Test
	public void testDeleteCarSucess() {
		controller.deleteCar(1L);
	}
	
	private Car getCar() {
		Car car = new Car();
		car.setId(1L);
		car.setModel("Fusca");
		car.setColor("Branco");
		car.setLicensePlate("ABC123");
		car.setChassi(1234L);
		return car;
	}
	
}
