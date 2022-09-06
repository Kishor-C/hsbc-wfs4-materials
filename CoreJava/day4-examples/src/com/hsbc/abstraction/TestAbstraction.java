package com.hsbc.abstraction;

interface Vehicle { 
	void mileage(); // by default methods are public & abstract
	public abstract void wheels(); // optional to write public & abstract
} 
abstract class Bike implements Vehicle {
	public void wheels() {System.out.println("____Bike with 2 wheels____"); }
}
class KTM extends Bike {
	public void mileage() {System.out.println("____KTM with 40kmpl___"); } 
}
class Pulsar extends Bike { 
	public void mileage() { System.out.println("____Pulsar with 34kmpl____"); }
}
public class TestAbstraction {
	public static void main(String[] args) {
		KTM ktm = new KTM();	System.out.println("______________");
		ui(ktm);
		Pulsar pulsar = new Pulsar(); System.out.println("___________");
		ui(pulsar);
	}
	public static void ui(Vehicle v) {
		v.wheels();
		System.out.println("_________________");
		v.mileage();
	}
}
