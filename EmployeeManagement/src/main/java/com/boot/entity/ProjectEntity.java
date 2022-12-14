package com.boot.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProjectEntity 
{
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
        private int projectId;
     
	    
	    @NotEmpty( message="Project name can not be empty")
	    @Column(nullable=false)
	    @Size(min=2,max=50,message="Project name must be minimum 2 characters and maximum 50")
	    private String projectName; 
     
        
	    @Column(nullable=false)
	    @NotNull(message ="Project Start Date can not be empty")
	    private Date startDate;
         
	    
	    @Column(nullable=false)
	    @NotNull(message ="Project End Date can not be empty")
        private Date endDate;
         
	    @NotEmpty( message="Project status can not be empty")
	    @Column(nullable=false)
	    @Size(min=2,max=50,message="Project status must be minimum 2 characters and maximum 50")
	    private String projectStatus;
	     
	    
	    @ManyToOne
		@JoinColumn(name = "did")
		private DepartmentEntity department;
	    
	    
	     @OneToMany(mappedBy = "project",cascade = CascadeType.ALL)
	 	@JsonIgnore
	 	private List<AllocateProjectEntity> allocateProjectList = new ArrayList<>();

		
		}

















