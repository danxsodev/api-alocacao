package br.sp.gov.etec.alocacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.sp.gov.etec.alocacao.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    
}
