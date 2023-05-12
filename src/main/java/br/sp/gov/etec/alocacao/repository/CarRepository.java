package br.sp.gov.etec.alocacao.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import br.sp.gov.etec.alocacao.model.Car;

@Repository
public interface CarRepository extends JpaRepositoryImplementation<Car, Long>{

}
