package com.tyshchenko.java.training.oop.lesson2.phone;

/**
 * @author Alexander Tyshchenko.
 */
public class IPhone extends Phone {
	
	public IPhone() {
		System.out.println("IPhone constructor");
		
		touch = true;
		hasWifi = true;
		screenSize = 3;
	}
	
	@Override
    public final void call(String number) {
		System.out.println("IPhone class is calling " + number);
	}
	
	@Override
	public void sendSMS(String number, String message) {
		System.out.println("IPhone class is sending sms " + message + " to " + number);	
	}
}
