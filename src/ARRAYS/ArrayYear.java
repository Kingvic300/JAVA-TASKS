import java.util.Scanner; 
public class ArrayYear{
	public static void main(String[] args){
		System.out.println(Year()); 

	}
	public static int Year(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year to return to a century"); 
			int year = input.nextInt();
		if (year >= 1 && year <= 100){
			System.out.println("This year belongs in the 1st century");

		}else if (year > 100 && year <= 200){
			System.out.println("This year belongs in the 2nd century");

		}else if (year > 200 && year <= 300){
			System.out.println("This year belongs in the 3rd century");

		}else if (year > 300 && year <= 400){
			System.out.println("This year belongs in the 4th century");

		}else if (year > 400 && year <= 500){
			System.out.println("This year belongs in the 5th century");

		}else if (year > 500 && year <= 600){
			System.out.println("This year belongs in the 6th century");

		}else if (year > 600 && year <= 700){
			System.out.println("This year belongs in the 7th century");

		}else if (year > 700 && year <= 800){
			System.out.println("This year belongs in the 8th century");

		}else if (year > 800 && year <= 900){
			System.out.println("This year belongs in the 9th century");

		}else if (year > 900 && year <= 1000){
			System.out.println("This year belongs in the 10th century");

		}else if (year > 1000 && year <= 1100){
			System.out.println("This year belongs in the 11th century");

		}else if (year > 1100 && year <= 1200){
			System.out.println("This year belongs in the 12th century");

		}else if (year > 1200 && year <= 1300){
			System.out.println("This year belongs in the 13th century");

		}else if (year > 1300 && year <= 1400){
			System.out.println("This year belongs in the 14th century");

		}else if (year > 1400 && year <= 1500){
			System.out.println("This year belongs in the 15th century");

		}else if (year > 1500 && year <= 1600){
			System.out.println("This year belongs in the 16th century");

		}else if (year > 1600 && year <= 1700){
			System.out.println("This year belongs in the 17th century");

		}else if (year > 1700 && year <= 1800){
			System.out.println("This year belongs in the 18th century");

		}else if (year > 1800 && year <= 1900){
			System.out.println("This year belongs in the 19th century");

		}else if (year > 1900 && year <= 2000){
			System.out.println("This year belongs in the 20th century");

		}else if (year > 2000 && year <= 2100){
			System.out.println("This year belongs in the 21st century");
		}
		if(year > 2100){
			System.out.println("This year has exceeded our limit try again");
		}
		if (year <= 0){
			System.out.println("This year has exceeded our limit try again");
		}
		return year;
	}

}