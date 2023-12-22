package basic_problemss;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner iScanner=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=iScanner.nextInt();

        int temp=n,r,rev=0;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(temp==rev)
            System.out.println("Given number is a palindrome!");
        else   
            System.out.println("Given number is not a palindrome!");
        iScanner.close();
    }
}
