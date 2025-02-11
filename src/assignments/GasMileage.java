package assignments;

import java.util.Scanner;
public class GasMileage{
	public static void main (String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("input number of trips:");
	int trips = input.nextInt();
	int totalmiles = 0;
	int totalgallon = 0;
	for(int count = 0; count<trips; count++){	
	System.out.println("input miles driven:");
		int miles = input.nextInt();
		totalmiles =+ miles;
	System.out.println("input gallon used:");
		int gallon = input.nextInt();
		totalgallon = + gallon;
}
		double totalmilesPerGallon = (totalmiles/totalgallon);
	System.out.print("Your total miles per gallon used is" +  totalmilesPerGallon); 



	

	}
}
