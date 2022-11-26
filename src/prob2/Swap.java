package prob2;

import java.util.Scanner;

public class Swap {
    int a,b;

    void swapWithExtraVariable(int a,int b){
        this.a=a;
        this.b=b;
        int temp=a;
        this.a=this.b;
        this.b=temp;
        System.out.println("Value of a="+this.a);
        System.out.println("Value of b="+this.b);
    }
    void swapWithoutExtraVariable(int num1,int num2){
       num1=num1+num2;
       num2=num1-num2;
       num1=num1-num2;
        System.out.println("----After swapping----");
        System.out.println("Value of a="+num1);
        System.out.println("Value of b="+num2);
    }

    public static void main(String[] args) {


        System.out.println("-----Menu-----");
        System.out.println("1.Swapping number with Extra variable");
        System.out.println("1.Swapping number without Extra variable\n");
        System.out.println("Enter your choice from the menu!");
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();


        Swap ob=new Swap();
        ob.a=10;
        ob.b=20;

        Swap ob2=new Swap();
        ob2.a=50;
        ob2.b=100;

        switch (ch){
            case 1:System.out.println("----Before swapping----");
                   System.out.println("a="+ob.a);
                   System.out.println("b="+ob.b);

                   ob.swapWithExtraVariable(ob.a,ob.b);
                   break;

            case 2:System.out.println("----Before swapping----");
                   System.out.println("a="+ob2.a);
                   System.out.println("b="+ob2.b);

                   ob.swapWithoutExtraVariable(ob2.a,ob2.b);
                   break;

            default:
                System.out.println("Invalid choice");
        }

    }
}
