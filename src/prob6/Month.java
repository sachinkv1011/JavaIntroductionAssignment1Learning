package prob6;

import java.util.Scanner;

public class Month {


    public  Month(int num){
        switch(num){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December1");
                break;
            default:
                System.out.println("Invalid month number");
                System.out.println("Choose from 1-12");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a month number");
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        Month ob=new Month(number);
    }
}
