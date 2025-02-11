import java.util.Scanner;
public class FinancialApplication2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal:");
        double subtotal = input.nextDouble();
        System.out.print("Enter the gratuity rate: ");
        double gratuityRate = input.nextDouble();
	tipCalculator(subtotal,gratuityRate);
	}
	public static void tipCalculator(double subtotal,double gratuityRate){
        double gratuity = subtotal * (gratuityRate / 100);
	double total = subtotal + gratuity;
        System.out.printf("The gratuity is $%.2f and the total is %.2f%n", gratuity, total);
    }
}