package ua.hillel.lessons.lesson23;

import hillel.ua.ValidatorEmail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestValidatorEmail {

    @Test
    public void test1() {
        Assertions.assertTrue(ValidatorEmail.isValid("qwe@gmail.com"));
    }
}
