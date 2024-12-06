package ua.hillel.lessons.lesson26.solid.demos._4_interface_segregation.bad;

public class Smartphone implements Component {

	public void mouseover(String event) {
		throw new UnsupportedOperationException("Mouse click not supported");
	}

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
