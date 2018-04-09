package com.demo.objectMethods;

public class WaitNotifyTest {
	
	public static void main(String[] args) {
		Message msg = new Message("process it");
		
		Waiter waiter = new Waiter(msg);
		Thread waiterThread=new Thread(waiter);
		waiterThread.start();
		System.out.println("...Thread name... :" +waiterThread.getName());
		
	    Waiter waiter1 = new Waiter(msg);
	    Thread waiter1Thread=new Thread(waiter1);
	    waiter1Thread.start();
	    System.out.println("...Thread name... :" +waiter1Thread.getName());
	    
	    Notifier notifier = new Notifier(msg);
	    Thread notifierThread=new Thread(notifier);
	    notifierThread.start();
	    
	    System.out.println("...Thread name... :" +notifierThread.getName());
	    System.out.println("All the threads are started");
	}

}