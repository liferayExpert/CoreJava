package com.demo.synchronization;
 
class Demo
{
	
	public static void main(String[] args) {
		
		User user = new User();
		
		 ThreadMessage S1 = new ThreadMessage( " User A " , user );
		 ThreadMessage S2 = new ThreadMessage( " User B " , user );
		 
		    S1.start();
	        S2.start();
		
	}
	 
}

class ThreadMessage extends Thread{
	
	private String msg;
	private Thread t;
	User user;
	
	ThreadMessage(String m,  User obj)
	    {
	        msg = m;
	        user = obj;
	    }
	
	public void run() {
		
	synchronized (user) {
			user.bookTicket(msg);
		}
	}
	
}

class User{
	
	public void bookTicket(String msg)
    {
        System.out.println("Welcome "+msg+" in Bus Booking Service");
        try
        {
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
            System.out.println("Thread  interrupted.");
        }
        System.out.println("\n" + msg + "Ticked Booked SuccessFully");
    }
	
}