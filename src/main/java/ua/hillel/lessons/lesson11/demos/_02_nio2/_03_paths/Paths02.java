package ua.hillel.lessons.lesson11.demos._02_nio2._03_paths;

import ua.hillel.lessons.lesson11.utils.Constants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

// Фільтрація даних.
public class Paths02 {

    public static void main(String[] args) {
        getOutput(getData(getPath()));
    }

    private static String getPath() {
        return Constants.BASE_PATH_IN + "reads/products.txt";
    }

    private static String getData(String path) {
        // try-with-resources because we're working
        // with file as data source/resource, that's why
        // we have to close the resource
        try(Stream<String> stream = Files.lines(Paths.get(path))) {
            AtomicInteger cnt = new AtomicInteger(0);
            StringBuilder sb = new StringBuilder();
            stream.filter(product -> product.contains("m"))
                    .forEach(name -> sb.append(cnt.incrementAndGet())
                            .append(") ").append(name).append("\n"));
            return sb.toString();
        } catch (IOException e) {
            return "Something wrong " + e.getMessage();
        }
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
