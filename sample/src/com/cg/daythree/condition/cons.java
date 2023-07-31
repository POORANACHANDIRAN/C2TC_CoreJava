package com.cg.daythree.condition;

public class cons {
	int id;  
    String name;  
    //creating a parameterized constructor  
   cons(int i,String n){  
    id = i;  
    name = n;  
    }  
    //method to display the values  
    void display(){System.out.println(id+" "+name);} 

	public static void main(String[] args) { 
		   
		   cons s1 = new cons(1,"Raja");  
		   cons s2 = new cons(2,"Raj");  
		    //calling method to display the values of object  
		    s1.display();  
		    s2.display();   

	}

}
