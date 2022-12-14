package com.boot.payload;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
//@NoArgsConstructor
//@ToString
public class EnrolledCourseDTO {

	
	private int enrolledId;
    
	
	private StudentDTO student;
	
	
	private CourseDTO course1;


	public int getEnrolledId() {
		return enrolledId;
	}


	public void setEnrolledId(int enrolledId) {
		this.enrolledId = enrolledId;
	}


	public StudentDTO getStudent() {
		return student;
	}


	public void setStudent(StudentDTO student) {
		this.student = student;
	}


	public CourseDTO getCourse1() {
		return course1;
	}


	public void setCourse1(CourseDTO course1) {
		this.course1 = course1;
	}


	@Override
	public String toString() {
		return "EnrolledCourseDTO [enrolledId=" + enrolledId + ", student=" + student + ", course1=" + course1 + "]";
	}


	public EnrolledCourseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}