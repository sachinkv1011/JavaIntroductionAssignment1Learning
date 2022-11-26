package prob4;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Enter the number to find the reverse ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int copy=num;
        int rev=0;
         if(num!=0){
             while(num!=0) {
                 int digit = num % 10;
                 rev = rev * 10 + digit;
                 num = num / 10;
             }
             System.out.println("The reverse of "+copy+" is "+rev);
         }
         else{
             System.out.println("Invalid input");
         }
    }
}
