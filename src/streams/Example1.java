package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ABCD", "HELLO", "Hey");
        System.out.println(list.stream()
                .flatMap(element -> Stream.of(new StringBuilder(element).reverse().toString()))
                .toList());

        System.out.println(0.0D);
    }
}
