package br.sp.gov.etec.alocacao.mapper;

import br.sp.gov.etec.alocacao.dto.CarDto;
import br.sp.gov.etec.alocacao.model.Car;

public class Mapper {
	
	public static Car fromToEntity(CarDto carDto) {
		
		Car car = new Car();
		car.setChassi(carDto.getChassi());
		car.setColor(carDto.getColor());
		car.setModel(carDto.getModel());
		car.setLicensePlate(carDto.getLicensePlate());
		return car;
		
	}
	
}
