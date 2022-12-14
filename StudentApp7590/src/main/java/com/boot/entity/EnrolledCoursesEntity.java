package com.boot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@ToString
public class EnrolledCoursesEntity {

	      @Id
	      @GeneratedValue(strategy = GenerationType.AUTO)
          private int enrolledId;
         
          @ManyToOne
          @JoinColumn(name="Sid")
	      private StudentEntity student;
	
	      @ManyToOne
	      @JoinColumn(name="Cid")
	      private CourseEntity course1;

		public int getEnrolledId() {
			return enrolledId;
		}

		public void setEnrolledId(int enrolledId) {
			this.enrolledId = enrolledId;
		}

		public StudentEntity getStudent() {
			return student;
		}

		public void setStudent(StudentEntity student) {
			this.student = student;
		}

		public CourseEntity getCourse1() {
			return course1;
		}

		public void setCourse1(CourseEntity course1) {
			this.course1 = course1;
		}

		@Override
		public String toString() {
			return "EnrolledCoursesEntity [enrolledId=" + enrolledId + ", student=" + student + ", course1=" + course1
					+ "]";
		}

		public EnrolledCoursesEntity() {
			super();
			// TODO Auto-generated constructor stub
		}
	      
	      
	      


}
