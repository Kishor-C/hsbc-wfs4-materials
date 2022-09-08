package com.hsbc.ui;

// You need to create R1 in a separate java file
class R1 implements Runnable {
	@Override
	public void run() {
		System.out.println("______run() starts______");
		for(int i = 1; i <= 500; i++) {
			System.out.println("i = "+i);
		}
		System.out.println("______run() ends________");
	}
}
class TicketBooking implements Runnable {
	private static int counter = 1;
	@Override
	public synchronized void run() {
		if(counter >= 1) {
			System.out.println("____Got the ticket_____");
			counter--;
		} else {
			System.out.println("____Ticket Sold Out_____");
		}
	}	
}
public class TestThreads {
	public static void main(String[] args) {
		TicketBooking ticket = new TicketBooking();
		new Thread(ticket).start();
		new Thread(ticket).start();
		new Thread(ticket).start();
		new Thread(ticket).start();
	}
}
