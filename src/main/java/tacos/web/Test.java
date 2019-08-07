package tacos.web;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test {
	
	 static void someFunction(String s) 
	    { 
	        System.out.println(s); 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	  
	        List<String> list = new ArrayList<String>(); 
	        list.add("Geeks"); 
	        list.add("For"); 
	        list.add("GEEKS"); 
	  
	        // call the static method 
	        // using double colon operator 
	        list.forEach(Test::someFunction); 
	        list.forEach(x -> System.out.println(x));
	    } 

}
