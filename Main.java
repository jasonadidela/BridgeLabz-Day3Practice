//9) Java Program to sort the elements of an array in ascending order

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
        for (int k : ary) {
            System.out.print(k + " ");
        }
        for (int i = 0; i < ary.length; i++) {
            for (int j = i+1; j < ary.length; j++) {
                if(ary[i] > ary[j]) {
                    int temp = ary[i];
                    ary[i] = ary[j];
                    ary[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Elements of array sorted in ascending order: ");
        for (int j : ary) {
            System.out.print(j + " ");
        }
    }
}