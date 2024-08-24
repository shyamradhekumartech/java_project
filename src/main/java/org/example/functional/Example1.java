package org.example.functional;

import java.util.Arrays;

public class Example1 {

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5};

        int[] newArray = Arrays.stream(array)
                .filter(num -> num % 2 == 0)
                .toArray();

        System.out.println(Arrays.toString(newArray));
    }

    public int[] findEvenNumUsingArray(int[] array) {
        return Arrays.stream(array)
                .filter(num -> num % 2 == 0)
                .toArray();
    }

}
