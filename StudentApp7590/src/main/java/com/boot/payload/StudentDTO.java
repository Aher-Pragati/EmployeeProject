package com.boot.payload;

import java.util.ArrayList;
import java.util.List;

import com.boot.entity.EnrolledCoursesEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



public class StudentDTO {

     private int studentId;
     
     private String studentName;
     
     private String studentEmail;
     
     private int studentAge;
     
     private String studentPassword;
     
     private String studentClass;
     
     
     
     public int getStudentId() {
		return studentId;
	}



	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}



	public String getStudentName() {
		return studentName;
	}



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	public String getStudentEmail() {
		return studentEmail;
	}



	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}



	public int getStudentAge() {
		return studentAge;
	}



	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}



	public String getStudentPassword() {
		return studentPassword;
	}



	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}



	public String getStudentClass() {
		return studentClass;
	}



	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	



	public StudentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "StudentDTO [studentId=" + studentId + ", studentName=" + studentName + ", studentEmail=" + studentEmail
				+ ", studentAge=" + studentAge + ", studentPassword=" + studentPassword + ", studentClass="
				+ studentClass + ", studentList=" + studentList + "]";
	}



	public List<EnrolledCoursesEntity> getStudentList() {
		return studentList;
	}
	
	




	public void setStudentList(List<EnrolledCoursesEntity> studentList) {
		this.studentList = studentList;
	}



	@JsonIgnore
     private List<EnrolledCoursesEntity> studentList=new ArrayList<>();
}