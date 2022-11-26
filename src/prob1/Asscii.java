package prob1;

import java.util.Scanner;

public class Asscii {
    static char ch;

    public static void main(String[] args) {
        System.out.println("Enter character to find ASSCII value");
        Scanner sc =new Scanner(System.in);
        ch=sc.next().charAt(0);
        int asscci=(int)ch;
        System.out.println("Asscii valu of "+ch+" is :"+ asscci);
    }
}
