//package com.boot.repository;
//
//import java.util.Date;
//
//import javax.validation.constraints.NotNull;
//
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//
//import com.boot.entity.EmployeeEntity;
//
//
//@DataJpaTest
//public class EmployeeRepositoryTest {
//	
//	@Autowired
//	private EmployeeRepository employeeRepository;
//	
//	@Test
//	@DisplayName("JUNIT test for save employee operation")
//	public void givenEmployeeObject_whenSaveEmployee_thenReturnedSavedEmployee()
//	{
//		EmployeeEntity employee = EmployeeEntity.builder()
//				                                .employeeName("Pragati")
//				                                .employeeAddress("Loni")
//				                                .employeeContactNumber(9403115257L)
//				                                .employeeSalary(45000)
//				                                .employeeEmail("pragati@gmail.com")
//				                                .employeeGender("Female")
//				                                .employeeDOB((java.sql.@NotNull(message = "Employee DateOfBirth can not be empty") Date) new Date("2002-Mar-11"))
//				                                .employeeDateOfJoin((java.sql.@NotNull(message = "Employee DateOfJoin can not be empty") Date) new Date("2022-Feb-18"))
//				                                .build();
//		
//		EmployeeEntity savedEmployee = this.employeeRepository.save(employee);
//		
//		
//		Assertions.assertThat(savedEmployee).isNotNull();
//		Assertions.assertThat(savedEmployee.getEmployeeId()).isGreaterThan(0);
//	}
//}
