package com.boot.payload;


import java.util.ArrayList;
import java.util.List;

import com.boot.entity.EnrolledCoursesEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
//@NoArgsConstructor
//@ToString
public class CourseDTO
{
	       private int courseId;
     
           private String courseName;
     
           private String courseDescription;
     
           private String courseDuration;
     
           private int courseFee;

           
           
           
           public CourseDTO() {
			super();
			// TODO Auto-generated constructor stub
		}




		@Override
		public String toString() {
			return "CourseDTO [courseId=" + courseId + ", courseName=" + courseName + ", courseDescription="
					+ courseDescription + ", courseDuration=" + courseDuration + ", courseFee=" + courseFee
					+ ", courseList=" + courseList + "]";
		}




		public int getCourseId() {
			return courseId;
		}




		public void setCourseId(int courseId) {
			this.courseId = courseId;
		}




		public String getCourseName() {
			return courseName;
		}




		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}




		public String getCourseDescription() {
			return courseDescription;
		}




		public void setCourseDescription(String courseDescription) {
			this.courseDescription = courseDescription;
		}




		public String getCourseDuration() {
			return courseDuration;
		}




		public void setCourseDuration(String courseDuration) {
			this.courseDuration = courseDuration;
		}




		public int getCourseFee() {
			return courseFee;
		}




		public void setCourseFee(int courseFee) {
			this.courseFee = courseFee;
		}




		public List<EnrolledCoursesEntity> getCourseList() {
			return courseList;
		}




		public void setCourseList(List<EnrolledCoursesEntity> courseList) {
			this.courseList = courseList;
		}




		@JsonIgnore
           private List<EnrolledCoursesEntity> courseList=new ArrayList<>();

}