//4) Java Program to print the smallest element in an array

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
        int min = array[0];
        for (int j : array) {
            if (j < min)
                min = j;
        }
        System.out.println("Largest element present in given array: " + min);
    }
}