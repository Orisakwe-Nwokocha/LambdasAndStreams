package practice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Practice1 {
    public static void main(String[] args) {
        String[] strings =
                {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};
        System.out.println(Arrays.stream(strings)
                .filter(s -> s.compareToIgnoreCase("n") < 0)
                .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                .collect(Collectors.toList()));
    }

}
