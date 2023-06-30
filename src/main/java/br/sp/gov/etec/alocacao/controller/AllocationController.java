package br.sp.gov.etec.alocacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.sp.gov.etec.alocacao.dto.AllocationDto;
import br.sp.gov.etec.alocacao.model.Allocation;
import br.sp.gov.etec.alocacao.service.Service;

@RestController
public class AllocationController {
	
	@Autowired
	private Service service; 
	
	@PostMapping("alugar")
	public Allocation alugar(@RequestBody AllocationDto dto) {	
		
		return service.calculate(dto);		
		
	}
	
}
