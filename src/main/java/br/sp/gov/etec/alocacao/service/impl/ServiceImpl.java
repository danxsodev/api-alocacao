package br.sp.gov.etec.alocacao.service.impl;

import java.lang.annotation.Annotation;
import java.time.LocalDate;
import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.sp.gov.etec.alocacao.dto.AllocationDto;
import br.sp.gov.etec.alocacao.model.Allocation;

import br.sp.gov.etec.alocacao.model.Client;

import br.sp.gov.etec.alocacao.model.Car;
import br.sp.gov.etec.alocacao.repository.AllocationRepository;
import br.sp.gov.etec.alocacao.repository.CarRepository;
import br.sp.gov.etec.alocacao.repository.ClientRepository;

@Service
public abstract class ServiceImpl implements Service {
	
	@Autowired
	ClientRepository clientRepository;
	
	@Autowired
	CarRepository carRepository;
	
	@Autowired
	AllocationRepository allocationRepository;
	
	public Allocation calculate(AllocationDto allocationDto) {
		
		Client client = clientRepository.findById(allocationDto.getIdClient()).get() ;
		
		Car car = carRepository.findById(allocationDto.getIdCar()).get();
		
		Allocation allocation = new Allocation();
		allocation.setCar(car);
		allocation.setClient(client);
		Period periodo = Period.between(LocalDate.parse(allocationDto.getStartDateAllocation()),
										LocalDate.parse(allocationDto.getEndDateAllocation()));
		Double valueAllocation = car.getGroup().getDailyValueGroup() * periodo.getDays();
		allocation.setValueAllocation(valueAllocation);
		return allocationRepository.save(allocation);
	}

	
}

