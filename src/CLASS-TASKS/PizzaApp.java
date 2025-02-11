import java.util.Scanner;

public class PizzaApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Number of guests that will attend the birthday party:");
        int guests = scan.nextInt();

        System.out.println("1: Sapa size\n2: Small money\n3: big boys\n4:Odogwu:");
        int pizzatype = scan.nextInt();
	int numberOfSlices = 0;
	int pricePerBox = 0;
	switch(pizzatype) {
		case 1:
			System.out.println("1: Sapa size:");
				numberOfSlices = 4;
				pricePerBox = 2000;
				
        			int boxesOfPizza = guests / numberOfSlices;
				int slice = 1+(boxesOfPizza); 
        			int totalSlice = slice * numberOfSlices;
        			int leftOver = totalSlice - guests;
        			int totalPrice = pricePerBox * slice;

        			System.out.println("Number of pizza to buy: " + slice + " boxes");
        			System.out.println("Number of leftover: " + leftOver + " slices");
        			System.out.println("Price: " + totalPrice);
					break;
		case 2:
			System.out.println("2: Small money:");
				numberOfSlices = 6;
				pricePerBox = 2400;
				
      				boxesOfPizza = guests / numberOfSlices;
				slice = 1+(boxesOfPizza);
        			totalSlice = slice * numberOfSlices;
        			leftOver = totalSlice - guests;
        			totalPrice = pricePerBox * slice;

        			System.out.println("Number of pizza to buy: " + slice + " boxes");
        			System.out.println("Number of leftover: " + leftOver + " slices");
        			System.out.println("Price: " + totalPrice);
					break;
		case 3:
			System.out.println("3: big boys:");
				numberOfSlices = 8;
				pricePerBox = 3000;
				
      				boxesOfPizza = guests / numberOfSlices;
				slice = 1+(boxesOfPizza);
        			totalSlice = slice * numberOfSlices;
        			leftOver = totalSlice - guests;
        			totalPrice = pricePerBox * slice;

        			System.out.println("Number of pizza to buy: " + slice + " boxes");
        			System.out.println("Number of leftover: " + leftOver + " slices");
        			System.out.println("Price: " + totalPrice);
					break;
		case 4:
			System.out.println("4: Odigwu:");
				numberOfSlices = 12;
				pricePerBox = 4200;
				
      				boxesOfPizza = guests / numberOfSlices;
				slice = 1+(boxesOfPizza);
        			totalSlice = slice * numberOfSlices;
        			leftOver = totalSlice - guests;
        			totalPrice = pricePerBox * slice;

        			System.out.println("Number of pizza to buy: " + slice + " boxes");
        			System.out.println("Number of leftover: " + leftOver + " slices");
        			System.out.println("Price: " + totalPrice);
					break;
	}
    }
}