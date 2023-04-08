package br.sp.gov.etec.alocacao.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.sp.gov.etec.alocacao.model.Car;

@RestController
public class CarController {
	
	@GetMapping("listar-carros")
	public List<Car> listCars(){
		Car car1 = new Car();
		car1.setId(1L);
		car1.setColor("amarelo");
		car1.setModel("HB20");
		car1.setLicensePlate("ABC-1234");
		car1.setChassi(123455666790L);
		
		Car car2 = new Car();
		car2.setId(2L);
		car2.setColor("vermelho");
		car2.setModel("Corsa");
		car2.setLicensePlate("CBA-1234");
		car2.setChassi(123455666710L);
		
		List cars = new ArrayList<Car> ();
		cars.add(car1);
		cars.add(car2);
		return cars;
	}
	
}

