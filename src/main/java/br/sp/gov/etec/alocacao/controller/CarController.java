package br.sp.gov.etec.alocacao.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.sp.gov.etec.alocacao.model.Car;
import br.sp.gov.etec.alocacao.repository.CarRepository;
import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;

@RestController
public class CarController {
	
	@SuppressWarnings("unchecked")
	
	@Autowired
	CarRepository repository;
	
	@GetMapping("listar-carros")
	public List<Car> listCars(){
		return repository.findAll();
	}
	
	@PostMapping("adicionar-carro")
	public Car insertCars(@RequestBody Car car) {
		return repository.save(car);
	}
	
}

