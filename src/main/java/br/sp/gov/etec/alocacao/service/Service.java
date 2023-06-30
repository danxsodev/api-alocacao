package br.sp.gov.etec.alocacao.service;

import br.sp.gov.etec.alocacao.dto.AllocationDto;
import br.sp.gov.etec.alocacao.model.Allocation;

public interface Service {
	
	public Allocation calcular(AllocationDto allocationDto);

}
