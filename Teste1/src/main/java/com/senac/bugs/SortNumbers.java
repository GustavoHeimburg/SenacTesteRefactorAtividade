package com.senac.bugs;

import java.util.Arrays;
import java.util.List;

public class SortNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 3, 2, 4);
        numbers.sort(Integer::compareTo);
        System.out.println(numbers);
    }
}
