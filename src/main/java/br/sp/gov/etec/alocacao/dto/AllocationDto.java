package br.sp.gov.etec.alocacao.dto;

public class AllocationDto {

	private Long idClient;
	private Long idCar;
	private String startDateAllocation;
	private String endDateAllocation;
	
	public Long getIdClient() {
		return idClient;
	}
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	
	public Long getIdCar() {
		return idCar;
	}
	public void setIdCar(Long idCar) {
		this.idCar = idCar;
	}
	
	public String getStartDateAllocation() {
		return startDateAllocation;
	}
	public void setStartDateAllocation(String startDateAllocation) {
		this.startDateAllocation = startDateAllocation;
	}
	
	public String getEndDateAllocation() {
		return endDateAllocation;
	}
	public void setEndDateAllocation(String endDateAllocation) {
		this.endDateAllocation = endDateAllocation;
	}
	
}
