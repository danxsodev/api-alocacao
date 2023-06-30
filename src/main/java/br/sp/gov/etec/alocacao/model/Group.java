package br.sp.gov.etec.alocacao.model;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Group {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column (name = "id_group")
		private Long idGroup;
		private String descriptionGroup;
		private Double dailyValueGroup;
		private LocalDate creationDateGroup;
		private LocalDate updateDateGroup;
		private boolean status;
		
		public Group() {
			super(); 
		}
		
		public Group(String descriptionGroup, Double dailyValueGroup, LocalDate creationDateGroup, LocalDate updateDateGroup, Boolean status) {
			super();
			this.descriptionGroup = descriptionGroup;
			this.dailyValueGroup = dailyValueGroup;
			this.creationDateGroup = creationDateGroup;
			this.updateDateGroup = updateDateGroup;
			this.status = status;
		}
		
		public Long getIdGroup() {
			return idGroup;
		}
		public void setIdGroup(Long id) {
			this.idGroup = id;
		}
		
		public String getDescriptionGroup() {
			return descriptionGroup;
		}
		public void setDescriptionGroup(String descriptionGroup) {
			this.descriptionGroup = descriptionGroup;
		}
		
		public Double getDailyValueGroup() {
			return dailyValueGroup;
		}
		public void setDailyValueGroup(Double dailyValueGroup) {
			this.dailyValueGroup = dailyValueGroup;
		}
		
		public LocalDate getCreationDateGroup() {
			return creationDateGroup;
		}
		public void setCreationDateGroup(LocalDate creationDateGroup) {
			this.creationDateGroup = creationDateGroup;
		}
		
		public LocalDate getUpdateDateGroup() {
			return updateDateGroup;
		}
		public void setUpdateDateGroup(LocalDate updateDateGroup) {
			this.updateDateGroup = updateDateGroup;
		}
		
		public boolean getStatus() {
			return status;
		}
		public void setStatus(boolean status) {
			this.status = status;
		}
		
		
}
