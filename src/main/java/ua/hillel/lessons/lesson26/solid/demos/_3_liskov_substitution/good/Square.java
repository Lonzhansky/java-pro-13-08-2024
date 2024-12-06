package ua.hillel.lessons.lesson26.solid.demos._3_liskov_substitution.good;

// Клас Square надає свій конструктор,
// де один параметр - сторона, оскільки сторони
// У квадрата - однакові.
public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }
}
