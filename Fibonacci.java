package basic_problemss;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n1=0,n2=1,n;
        
        System.out.print("enter the values of n:");
        Scanner inputScanner=new Scanner(System.in);
        n=inputScanner.nextInt();
        System.out.print(n1+" "+n2+" ");
        for(int i=1;i<=n-2;i++){
            int n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
        inputScanner.close();
    }
}
