package com.gla.arrays;
import java.util.Scanner;
public class DigitFrequncy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        String numStr = Long.toString(Math.abs(number));
        int count = numStr.length();

        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = numStr.charAt(i) - '0';
        }

        // d. Frequency array of size 10
        int[] frequency = new int[10];
        for (int digit : digits) {
            frequency[digit]++;
        }

        System.out.println("\n--- Digit Frequency ---");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times.");
            }
        }

    }
}