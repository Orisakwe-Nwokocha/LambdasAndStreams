package practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Practice2 {
    public static void main(String[] args) {
        Double[] salaries = {
                5_000.0, 7600.0, 3587.5, 4700.77, 6200.0, 3200.0, 4236.4
        };

        List<Double> salariesList = Arrays.asList(salaries);

        Predicate<Double> fourToSixThousand = x -> x >= 4000 && x <= 6000;
        System.out.println(salariesList.stream()
                .filter(fourToSixThousand)
                .findFirst().orElseThrow());


    }

}
