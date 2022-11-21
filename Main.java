//6) Java Program to print the elements of an array in reverse order

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int a = value.nextInt();
        int[] ary = new int[a];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<a; i++) {
            ary[i]=value.nextInt();
        }
        System.out.println("Original array: ");
        for (int j : ary) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");
        for (int i = ary.length-1; i >= 0; i--) {
            System.out.print(ary[i] + " ");
        }
    }
}