import java.util.Scanner;

public class P_EMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal ");
        float p = sc.nextFloat();
        System.out.println("Enter Rate ");
        float R = sc.nextFloat();
        System.out.println("Enter months");
        float m = sc.nextFloat();
        float r = R/1200;
        float a = 1+r;
        float b = (float) Math.pow(a,m);
        float e = (p*r*b)/(b-1);
        System.out.println("EMI is equal to "+e);
    }
}
