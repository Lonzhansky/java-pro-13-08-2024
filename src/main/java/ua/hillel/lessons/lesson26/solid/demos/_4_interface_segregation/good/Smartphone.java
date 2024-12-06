package ua.hillel.lessons.lesson26.solid.demos._4_interface_segregation.good;

public class Smartphone implements UITouch {

	public void touch(String event) {
		System.out.println("Touch Event Fired");
	}

	public void swipe(String event) {
		System.out.println("Swipe Event Fired");
	}

	public void validate() {
		System.out.println("All UI events are valid");
	}
}
