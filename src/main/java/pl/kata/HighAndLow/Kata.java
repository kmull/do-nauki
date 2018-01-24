package pl.kata.HighAndLow;

import java.util.Arrays;

public class Kata {

    public static String HighAndLow(String numbers) {
        // Code here or

        int min = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .min()
                .getAsInt();

        int max = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .max()
                .getAsInt();

        return max + " " + min;

    }


    public static void main(String[] args) {
        String a = HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4");
        System.out.println(a);
    }
}
