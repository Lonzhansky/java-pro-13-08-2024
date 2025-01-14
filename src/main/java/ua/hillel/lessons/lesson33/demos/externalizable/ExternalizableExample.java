package ua.hillel.lessons.lesson33.demos.externalizable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizableExample {

    public static void main(String[] args) {

        Person person = new Person("Bob", 45);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person_ext.ser"))) {
            oos.writeObject(person);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person_ext.ser"))) {
            Person deserializationPerson = (Person) ois.readObject();
            System.out.println(deserializationPerson);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
