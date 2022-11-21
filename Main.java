//1) Java Program to print the elements of an array

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner var=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n=var.nextInt();
        int[] array = new int[10];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++) {
            array[i]=var.nextInt();
        }
        System.out.println("Array elements are: ");
        for (int i=0; i<n; i++){
            System.out.println(array[i]);
        }
    }
}