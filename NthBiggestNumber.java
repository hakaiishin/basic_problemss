package basic_problemss;

/*
 * Program for calculating nth biggest number for all elements in an array.
 * 
 */

import java.util.Scanner;

public class NthBiggestNumber {
    public static void main(String[] args) {
        System.out.print("Enter the size of the array:");
        Scanner iScanner=new Scanner(System.in);
        int number=iScanner.nextInt();

        double A[] = new double[number];

        for (int i = 0; i < A.length; i++) {
            System.out.print("enter the A["+i+"] element:");
            A[i]=iScanner.nextDouble();
        }

        System.out.println();

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println("\n");

        for (int i = 0; i < A.length; i++) {
            int count=0;
            for (int j = 0; j < A.length; j++) {
                if(A[i]<A[j])
                    count++;
            }
            for (int k = 0; k < A.length; k++){
                if(count==k){
                    System.out.println("The number "+A[i]+" is the "+(k+1)+"th biggest number!");
                    break;
                }
            }
        }
        iScanner.close();
    }
}
