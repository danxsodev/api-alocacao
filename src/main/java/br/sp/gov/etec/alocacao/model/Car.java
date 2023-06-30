package br.sp.gov.etec.alocacao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long id;
	private String model;
	private String color;
	private String licensePlate;
	private Long chassi;
	
	@OneToOne
	private Group group;
	
	public Car() {
		super(); 
	}
	
	public Car(String model, String color, String licensePlate, Long chassi) {
		super();
		this.model = model;
		this.color = color;
		this.licensePlate = licensePlate;
		this.chassi = chassi;
	}
	
		
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getLicensePlate() {
		return licensePlate;
	}
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	
	public Long getChassi() {
		return chassi;
	}
	public void setChassi(Long chassi) {
		this.chassi = chassi;
	}
	
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
	
}
