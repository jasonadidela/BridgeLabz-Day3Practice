//5) Java Program to print the elements of an array present on an even position

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int n = var.nextInt();
        int[] array = new int[10];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = var.nextInt();
        }
        System.out.println("Elements of given array present on even position: ");
        for (int i = 1; i < array.length; i = i + 2) {
            System.out.println(array[i]);
        }
    }
}