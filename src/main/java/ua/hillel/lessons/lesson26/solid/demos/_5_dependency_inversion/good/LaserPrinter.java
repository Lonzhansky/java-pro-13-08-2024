package ua.hillel.lessons.lesson26.solid.demos._5_dependency_inversion.good;

public class LaserPrinter implements Printer {

	public void print(String text){
		System.out.println(text);
	}
}
