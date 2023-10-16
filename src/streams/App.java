package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        int var = IntStream
                .range(1,5)
                .sum();
        System.out.println(var);

        Stream.of("hello", "world", "cat", "apple")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        String[] items = {"bye", "buy", "hello", "world", "cat", "apple", "book"};
        Stream.of(items)
                .filter((x)->x.startsWith("b"))
                .sorted()
                .forEach(x -> System.out.print(x+" ,"));

        System.out.println();
        Arrays.stream(new int[] {2,3,9,1,0})
                .map((x)->x*x)
                .average()
                .ifPresent(System.out::print);

        System.out.println();
        List<String> list = Arrays.asList("Bye", "buy", "hello", "world", "cat", "apple", "bOOk");
        list.stream()
                .map(String::toLowerCase)
                .filter((x)->x.startsWith("b"))
                .sorted()
                .forEach(x -> System.out.print(x+" ,"));

        System.out.println();
        try (Stream<String> lines = Files.lines(Paths.get("files/wordFile.txt"))){
            lines.sorted()
                    .filter((x)->x.length()>10)
                    .forEach(x -> System.out.print(x+" ,"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println();
        try {
            List<String> words = Files.lines(Paths.get("files/wordFile.txt"))
                    .filter((x)->x.contains("th"))
                    .toList();
            words.forEach(x -> System.out.print(x+" ,"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println();
        try (Stream<String> rows = Files.lines(Paths.get("files/stockDataCsv.txt"))){

            int rowCount= (int) rows
                    .map((x)->x.split(","))
                    .filter((x)->x.length>3)
                    .count();
            System.out.println(rowCount+" rows");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
}
