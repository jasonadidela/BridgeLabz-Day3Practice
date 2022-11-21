//10) Find 2nd Largest Number in an Array

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int a = value.nextInt();
        int[] array = new int[a];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < a; i++) {
            array[i] = value.nextInt();
        }
        int max;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    max = array[i];
                    array[i] = array [j];
                    array[j] = max;
                }
            }
        }
        System.out.println("Second Largest Number in array:"+ array[a-2]);
    }
}