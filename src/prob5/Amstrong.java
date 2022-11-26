package prob5;

import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int start;
        int limit;
        System.out.println("Enter the staring position");
        start=sc.nextInt();
        System.out.println("Enter the Ending Position");
        limit=sc.nextInt();

        for(int i =start+1; i<limit; i++){
            int copy=i;
            int ams=0;
            int noOfDigits=0;

            while(copy!=0){
                copy/=10;
                ++noOfDigits;
            }
            copy=i;

            while(copy!=0){
                int digit=copy % 10;
                ams+=Math.pow(digit,noOfDigits);
                copy=copy/10;
            }
            if(i==ams) {
                System.out.println(ams);
            }
        }
    }
}
