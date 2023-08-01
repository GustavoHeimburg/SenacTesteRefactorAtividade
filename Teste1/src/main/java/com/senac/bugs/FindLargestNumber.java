package com.senac.bugs;

import java.util.Arrays;
import java.util.List;

public class FindLargestNumber {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, -4, 5);
        int largestNumber = numbers.get(0);
        for (int number : numbers) {
            if (number > largestNumber) {
                largestNumber = number;
            }
        }
        System.out.println("O maior número é " + largestNumber);
    }
}


