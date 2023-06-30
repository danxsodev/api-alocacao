package br.sp.gov.etec.alocacao.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.sp.gov.etec.alocacao.model.Car;
import br.sp.gov.etec.alocacao.repository.CarRepository;

import br.sp.gov.etec.alocacao.model.Group;
import br.sp.gov.etec.alocacao.repository.GroupRepository;

public class GroupController {

	@Autowired 
	private GroupRepository repository;
	
	@GetMapping("/grupos")
	public ResponseEntity<?> listGroup() {		
		 List<Group> group = repository.findAll();
		 return new ResponseEntity(group,HttpStatus.ACCEPTED);
	}
	
	@PostMapping("adicionar-grupo")
	public Group addGroup(@RequestBody Group group) {
		group.setCreationDateGroup(LocalDate.now());
		group.setUpdateDateGroup(LocalDate.now());
		return repository.save(group);
	}
	
	@PutMapping("atualizar-grupo")
	public Group updateGroup(@RequestBody Group group) {
		return repository.save(group);
	}
	
	@DeleteMapping("deletar-grupo/{id}")
	public void deleteGroup(@PathVariable long id) {
		repository.deleteById(id);
	}

}
