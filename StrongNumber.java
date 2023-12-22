package basic_problemss;

import java.util.Scanner;

/**
 * StrongNumber
 */
public class StrongNumber {
    public static int factorial(int x){
        int f=1;
        for(int i=2;i<=x;i++)
            f=f*i;
        return f;
    }
    public static void main(String[] args) {
        System.out.print("enter the number");
        Scanner iScanner= new Scanner(System.in);

        int nubmer=iScanner.nextInt();
        int res=0,r,temp=nubmer;
        while(nubmer>0){
            r=nubmer%10;
            res=res+factorial(r);
            nubmer=nubmer/10;
        }

        if(temp==res)
            System.out.println("Given number is a strong number!");
        else   
            System.out.println("Given number is not a strong number!");
        iScanner.close();
    }
}