package Chapter7;

import java.util.Scanner;

public class CompoundInterestCalculator {
    private static final int COMMPOUNDFREQUENCY = 12;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter initial investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter monthly contribution: ");
        double monthlyContribution = input.nextDouble();

        System.out.print("Enter length of time in years: ");
        int years = input.nextInt();

        System.out.print("Enter estimated interest rate: ");
        double interestRate = input.nextDouble();

        System.out.print("Enter interest rate variance range: ");
        double varianceRate = input.nextDouble();

        double numerator = (1 + interestRate) * (varianceRate * COMMPOUNDFREQUENCY);
    }
}
