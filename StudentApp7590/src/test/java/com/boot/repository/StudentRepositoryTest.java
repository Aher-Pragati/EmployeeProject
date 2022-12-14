package com.boot.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.boot.entity.StudentEntity;

@DataJpaTest
public class StudentRepositoryTest 
{
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	@DisplayName("JUNIT test for save student operation")
	public void givenStudentObject_whenSaveStudent_thenReturnedSavedStudent()
	{
		StudentEntity student = StudentEntity.builder()
				                             .studentName("Pragati")
				                             .studentAge(22)
				                             .studentClass("BCA")
				                             .studentEmail("pragati@gmail.com")
				                             .build();
		
		StudentEntity savedStudent = this.studentRepository.save(student);
		
		
		Assertions.assertThat(savedStudent).isNotNull();
		Assertions.assertThat(savedStudent.getStudentId()).isGreaterThan(0);
			
	}
	

}
