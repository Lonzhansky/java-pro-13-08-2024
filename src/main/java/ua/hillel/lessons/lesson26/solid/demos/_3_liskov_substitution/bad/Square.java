package ua.hillel.lessons.lesson26.solid.demos._3_liskov_substitution.bad;

// Порушення принципу підстановки Барбари Лисков,
// тому що клас Square має додаткові
// обмеження, тобто висота та ширина, які
// мають бути однаковими.
// Тому клас Rectangle (базовий клас) не можна замінити
// класом Square (похідним класом).
//
// Заміна класу Rectangle на клас Square може призвести
// до несподіваної поведінки програми.
public class Square extends Rectangle {

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public void setWidth(double width) {
        super.setHeight(width);
        super.setWidth(width);
    }
}
