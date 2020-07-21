package com.epam.Java_8_Lambdas_Streams;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class Fiter_Strings {
	public static List<String> search(List<String> list) {
		return list
				.stream()
				.filter(s -> s.startsWith("a") && s.length()==3)
				.collect(Collectors.toList());
	}
	
	public static void main(String args[]) {
		
		List<String> arraylist = new ArrayList<String>();
		 arraylist.add("abc"); 
	        arraylist.add("aaa"); 
	        arraylist.add("bbb");
	        arraylist.add("abcd");
	        List<String> s = search(arraylist); 
	        System.out.println(s);
		 
            
		
	}
}
