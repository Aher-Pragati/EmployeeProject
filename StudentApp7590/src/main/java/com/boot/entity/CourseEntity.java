package com.boot.entity;

import java.util.ArrayList;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
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
@Table(name="course")

public class CourseEntity {
	

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int courseId;
    
    @NotEmpty( message="Course name can not be empty")
       @Column(nullable=false)
       @Size(min=2,max=10,message="course name must be minimum 2 characters and maximum 10")
    
    private String courseName;
    
    @NotEmpty( message="CourseDescription name can not be empty")
      
    @Size(min=2,max=100,message="courseDuration name must be minimum 2 characters and maximum 100")
    @Column(nullable=false)
    
       private String courseDescription;
   
    @NotEmpty( message="CourseDuration can not be empty")
    @Size(min=2,max=10,message="courseDuration name must be minimum 2 characters and maximum 10")
	    @Column(nullable = false)
    
    private String courseDuration;
    
    @NotNull( message="CourseFee  can not be empty")
    @Min(message="Minimum fee should be 500",value=500)
       @Max(message="Maximum fee should be 1000",value=1000)
       @Column(nullable = false)
    
    private int courseFee;
 
    @JsonIgnore
    @OneToMany(mappedBy ="course1" ,cascade = CascadeType.ALL)
    private List<EnrolledCoursesEntity> courseList=new ArrayList<>();
    

            @Override
	public String toString() {
		return "CourseEntity [courseId=" + courseId + ", courseName=" + courseName + ", courseDescription="
				+ courseDescription + ", courseDuration=" + courseDuration + ", courseFee=" + courseFee
				+ ", courseList=" + courseList + "]";
	}

			public CourseEntity() {
		super();
		// TODO Auto-generated constructor stub
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

            
            
            
            
}