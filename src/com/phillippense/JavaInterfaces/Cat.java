package com.phillippense.JavaInterfaces;

public class Cat implements Mammal{
	
	public void speak() {
		System.out.println("Cats Meow");
	}
	
	public void run() {
		System.out.println("Cats can run at a top speed of 30 mph");
	}
	
	public void eat() {
		System.out.println("Cats eat mice");
	}

}
