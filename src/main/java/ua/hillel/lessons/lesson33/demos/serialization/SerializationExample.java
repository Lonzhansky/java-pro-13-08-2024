package ua.hillel.lessons.lesson33.demos.serialization;

import java.io.*;

public class SerializationExample {

    public static void main(String[] args) {

        Person person = new Person("Alex", 35);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            oos.writeObject(person);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person deserializationPerson = (Person) ois.readObject();
            System.out.println(deserializationPerson);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
