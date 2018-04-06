package com.demo.singleton;


//Make constructor as private.
//Write a static method that has return type object of this singleton class. Here, the concept of Lazy initialization in used to write this static method.

public class Demo {
	
	public static void main(String args[])
    {
        // instantiating Singleton class with variable x
		
        Singleton x = Singleton.getInstance();
 
        // instantiating Singleton class with variable y
        Singleton y = Singleton.getInstance();
 
        // instantiating Singleton class with variable z
        Singleton z = Singleton.getInstance();
 
        // changing variable of instance x
        x.s = (x.s).toUpperCase();
 
       System.out.println("String from x is " + x.s);
       System.out.println("String from y is " + y.s);
       System.out.println("String from z is " + z.s);
       System.out.println("\n");
 
        // changing variable of instance x
        z.s = (z.s).toLowerCase();
 
       System.out.println("String from x is " + x.s);
      System.out.println("String from y is " + y.s);
       System.out.println("String from z is " + z.s);
    }

}


class Singleton
{
    // static variable single_instance of type Singleton
    private static Singleton single_instance=null;
 
    // variable of type String
    public String s;
 
    // private constructor restricted to this class itself
    private Singleton()
    {
    	System.out.println("Call only the first time");
        s = "Hello I am a string part of Singleton class";
    }
 
    // static method to create instance of Singleton class
    public static Singleton getInstance()
    {
        // To ensure only one instance is created
        if (single_instance == null)
        {
        	
            single_instance = new Singleton();
        }
        return single_instance;
    }
}
