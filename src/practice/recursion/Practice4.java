package practice.recursion;

import java.util.Arrays;

public class Practice4 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i <= 40; i++) {
            System.out.println("fibonacci of " + i + " = " + fibonacci(i));
        }
        long end = System.currentTimeMillis();
        System.out.println("time taken: "+ (end - start));
        start = System.currentTimeMillis();
        System.out.println("first 10 fibonacci of " + 10 + " = " + Arrays.toString(fibonacci2(10)));
        end = System.currentTimeMillis();
        System.out.println("time taken: "+ (end - start));
    }

    private static int fibonacci(int number) {
        if (number == 0 || number == 1) return number;
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    private static int[] fibonacci2(int number) {
        int[] fibonacci = new int[number];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int index = 2; index < number; index++) {
            fibonacci[index] = fibonacci[index - 1] + fibonacci[index - 2];
        }
        return fibonacci;
    }

}
