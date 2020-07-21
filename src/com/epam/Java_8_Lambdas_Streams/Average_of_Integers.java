package com.epam.Java_8_Lambdas_Streams;

import java.util.*; 
import java.util.stream.IntStream; 

public class Average_of_Integers {
	 public static void main(String[] args) 
	    {
		 	int a[]= {2,3,4,5,6,7,8,9};
	        IntStream stream = IntStream.of(a); 
	        OptionalDouble obj = stream.average(); 
	        if (obj.isPresent()) { 
	            System.out.println(obj.getAsDouble()); 
	        } 
	        else { 
	            System.out.println("-1"); 
	        } 
	    } 

}
