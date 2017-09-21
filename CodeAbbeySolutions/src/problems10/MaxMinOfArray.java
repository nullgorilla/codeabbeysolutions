package problems10;

import java.util.Scanner;

public class MaxMinOfArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input data:");
        int size = 300;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        String result = getMaximum(array);
        System.out.println("answer:\n" + result);
        input.close();

    }

    public static String getMaximum(int[] array) {
        int maxNumber = array[0];
        int minNumber = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            } else if (array[i] < minNumber) {
                minNumber = array[i];
            }

        }

        return (maxNumber + " " + minNumber);
    }

}