package br.sp.gov.etec.alocacao.model;

public class Car {

	private Long id;
	private String model;
	private String color;
	private String licensePlate;
	private Long chassi;
	
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
	
}
