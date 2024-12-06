package ua.hillel.lessons.lesson26.solid.demos._4_interface_segregation.bad;

public class Desktop implements Component {

	public void mouseover(String event) {
		System.out.println("Mouse click Event Fired");
	}

	public void touch(String event) {
		throw new UnsupportedOperationException("Touch not supported");
	}

	public void swipe(String event) {
		throw new UnsupportedOperationException("Swipe not supported");
	}
	
	public void validate() {
		System.out.println("All UI events are valid");
	}
}
