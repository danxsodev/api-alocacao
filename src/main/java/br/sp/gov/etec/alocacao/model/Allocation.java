package br.sp.gov.etec.alocacao.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Allocation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	private Client client;
	
	@OneToOne
	private Car car;
	
	private Double valueAllocation;
	
	private LocalDate startDateAllocation; 
	
	private LocalDate endDateAllocation;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Double getValueAllocation() {
		return valueAllocation;
	}

	public void setValueAllocation(Double valueAllocation) {
		this.valueAllocation = valueAllocation;
	}

	public LocalDate getStartDateAllocation() {
		return startDateAllocation;
	}

	public void setStartDateAllocation(LocalDate startDateAllocation) {
		this.startDateAllocation = startDateAllocation;
	}

	public LocalDate getEndDateAllocation() {
		return endDateAllocation;
	}

	public void setEndDateAllocation(LocalDate endDateAllocation) {
		this.endDateAllocation = endDateAllocation;
	}

	
}
