package basic_problemss;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n=0,temp=n,res=0,r;
        System.out.print("enter the number:");
        Scanner iScanner= new Scanner(System.in);
        n=iScanner.nextInt();

        while (n>0) {
            r=n%10;
            res=res+(r*r*r);
            n=n/10;
        }
        if(temp==res)
            System.out.println("Given number is an Armstrong Number!");
        else
            System.out.println("Given nubmer is not an Armstrong Number!");

        iScanner.close();
    }
}
