//3) Java Program to print the largest element in an array

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int n=value.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            array[i]=value.nextInt();
        }
        int max = array[0];
        for (int j : array) {
            if (j > max)
                max = j;
        }
        System.out.println("Largest element present in given array: " + max);
    }
}