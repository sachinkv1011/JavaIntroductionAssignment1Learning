package prob3;

public class LargestOf3 {
    static int a,b,c;

    public static void main(String[] args) {
        a=1000;
        b=20000;
        c=300;

        if(a>b && a>c){
            System.out.println("Largest is "+a);
        } else if (b>a && b>c) {
            System.out.println("Largest is "+b);
        }
        else {
            System.out.println("Largest is "+c);
        }
    }
}
