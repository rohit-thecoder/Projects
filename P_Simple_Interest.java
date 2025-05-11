import java.util.Scanner;

public class P_Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal Value ");
        float p = sc.nextFloat();

        System.out.println("Enter Rate of Interest ");
        float r = sc.nextFloat();

        System.out.println("Enter Time ");
        float t = sc.nextFloat();

        float si = (p*r*t)/100;

        System.out.println("Principal" +p);
        System.out.println("Rate" +r);
        System.out.println("Time" +t);

        System.out.println("Simple Interest is " +si);

    }
}
