package com.hari.json.Jackson_Project;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Driver 
{
	public static void main( String[] args )
	{	

		//Object mapper uses setter methohds for converting JSON to POJO and
		//getters for converting POJO to JSON.
		ObjectMapper objectMapper=new ObjectMapper();
		try{
			Employee employee=objectMapper.readValue(new File("data/simple.json"),Employee.class);
			System.out.println(employee);
			objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
			objectMapper.writeValue(new File("data/created_by_Jackson.json"),employee);
		}catch(Exception exc){
			exc.printStackTrace();
		}
	}
}
