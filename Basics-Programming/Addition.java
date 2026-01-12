import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double no1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double no2 = sc.nextDouble();
		double sum = no1 + no2;

        System.out.println("Addition of two nos = " + sum);
    }
}