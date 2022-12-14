package com.boot.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ResourceNotFoundException extends RuntimeException
{
    private String resourceName;// student
   
    private String fieldName;//studentDTO
   
    private int fieldValue;//20
   
  
}