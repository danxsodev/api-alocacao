package br.sp.gov.etec.alocacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.sp.gov.etec.alocacao.dto.CarDto;
import br.sp.gov.etec.alocacao.model.Car;
import br.sp.gov.etec.alocacao.repository.CarRepository;

import br.sp.gov.etec.alocacao.model.Group;
import br.sp.gov.etec.alocacao.repository.GroupRepository;

import br.sp.gov.etec.alocacao.mapper.Mapper;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;

@RestController
public class CarController {
	
	@SuppressWarnings("unchecked")
	
	@Autowired
	CarRepository carRepository;
	
	@Autowired
	GroupRepository groupRepository;
		
	@GetMapping("listar-carros")
	public List<Car> listCars(){		
		return carRepository.findAll();
	}
	
	@PostMapping("adicionar-carro")
	public Car insertCars(@RequestBody CarDto carDto) {
		
		Car carEntry = Mapper.fromToEntity(carDto);
		Group group = groupRepository.findById(carDto.getIdGroup()).get();
		carEntry.setGroup(group);
		return carRepository.save(carEntry);
	}
	
	 @PutMapping("atualizar-carro")
	    public Car updateCar(@RequestBody Car car) {
		 return carRepository.save(car);  
	 }

	@DeleteMapping("deletar-carro/{id}")
		public ResponseEntity deleteCar(@PathVariable long id) {
			carRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatusCode.valueOf(200));
			
	}
			    
}
