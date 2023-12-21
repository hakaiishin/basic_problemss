package basic_problemss;

import java.util.Scanner;

public class Reverse_a_Number {
    public static void main(String[] args) {
        int r,rev=0;
        System.out.print("enter the number to be reveresed");
        Scanner inpScanner=new Scanner(System.in);

        int n=inpScanner.nextInt();
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        inpScanner.close();
        System.out.println(rev);
    }
}
