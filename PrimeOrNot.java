package basic_problemss;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        int number,factor=0;
        Scanner input=new Scanner(System.in);

        System.out.print("enter the input:");
        number=input.nextInt();

        for(int i=1;i<=number;i++){
            if(number%i==0)
                factor++;
        }

        if(factor==2)
            System.out.println("Given number "+number+" is prime!");
        else
            System.out.println("Given number "+number+" is not prime!");
        
        input.close();
    }
}
