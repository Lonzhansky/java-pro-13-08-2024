package ua.hillel.lessons.lesson33.demos.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSerializationExample {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        Person2 person = new Person2("Alice", 25);

        try {

            String jsonPerson = mapper.writeValueAsString(person);
            System.out.println(jsonPerson);

            Person2 deserializationPerson = mapper.readValue(jsonPerson, Person2.class);
            System.out.println(deserializationPerson);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
