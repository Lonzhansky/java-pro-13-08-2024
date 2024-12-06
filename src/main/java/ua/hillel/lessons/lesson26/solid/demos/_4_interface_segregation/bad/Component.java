package ua.hillel.lessons.lesson26.solid.demos._4_interface_segregation.bad;

public interface Component {
	void mouseover(String event);
	void touch(String event);
	void swipe(String event);
	void validate();
}
