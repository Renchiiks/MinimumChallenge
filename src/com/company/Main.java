package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many integers");
        int count = sc.nextInt();
        int[] array = readIntegers(count);
        System.out.println(findMin(array));


    }

    public static int[] readIntegers(int count) {
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Enter number: " + (i + 1));
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
