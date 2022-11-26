package prob3;

public class Largest1step {
    static int a=100,b=200,c=300;

    public static void main(String[] args) {
        int big = a > b ? ( a > c ? a : c) : (b > c ? b : c) ;
        System.out.println("Larger is "+big);
    }
}
