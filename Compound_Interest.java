import java.util.Scanner;

import static java.lang.Math.pow;

public class Compound_Interest {
    public static void main(String[] args) {
        System.out.println("Enter Principal ");
        Scanner sc = new Scanner(System.in);
        float p = sc.nextFloat();

        System.out.println("Enter rate ");
        float r = sc.nextFloat();

        System.out.println("Enter Time ");
        float t = sc.nextFloat();

        System.out.println("Number of times intrest is compounded per year");
        float n = sc.nextFloat();

        float z = n*t;
        float x = (1+ r/n);
        System.out.println("Amount: "+ p* Math.pow(x,z));





    }
}
