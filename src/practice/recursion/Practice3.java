package practice.recursion;

import java.math.BigInteger;
import java.util.stream.LongStream;

import static java.math.BigInteger.ONE;

public class Practice3 {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            System.out.println(i + "! = " + factorial(i));
            System.out.println(i + "! with lambda = " + factorialLambda(i));
        }
    }

    private static BigInteger factorial(long number) {
        if (number <= 1) return ONE;
        return BigInteger.valueOf(number).multiply(factorial(number - 1));
    }

    private static BigInteger factorialLambda(long number) {
        if (number <= 1) return ONE;
        return LongStream.rangeClosed(1, number)
                .mapToObj(BigInteger::valueOf)
                .reduce(ONE, BigInteger::multiply);
    }
}
