package com.boot.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Getter
//@Setter
//@NoArgsConstructor
public class ResourceNotFoundException extends RuntimeException
{
   public ResourceNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResourceNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public ResourceNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ResourceNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ResourceNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public int getFieldValue() {
		return fieldValue;
	}

	public void setFieldValue(int fieldValue) {
		this.fieldValue = fieldValue;
	}

private String resourceName;// student
   
   private String fieldName;//studentDTO
   
   private int fieldValue;//20
   
   public ResourceNotFoundException(String resourceName, String fieldName, int fieldValue)
   {
	   super(resourceName+" not found with"+fieldName+" : "+fieldValue);
	   //super(String.format("%s not found with %s : %d", resourceName,fieldName,fieldValue));
	   this.resourceName = resourceName;
	   this.fieldName = fieldName;
	   this.fieldValue = fieldValue;
   }
}