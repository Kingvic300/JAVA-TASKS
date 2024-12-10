import java.util.Scanner; 
public class  CreditCardValidator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
			System.out.println("        Hello, Kindly Enter Card Details to verify      ");
				String cardNumber = input.next();
		
	//
		if(cardNumber.isEmpty()){
			System.out.print("Invalid card number");
	
		}else{
			int [] array = new int [cardNumber.length()];
			for (int count = 0;count < cardNumber.length();count ++) {
            			array[count] = Character.getNumericValue(cardNumber.charAt(count)); 
			
			}
			System.out.println("Credit Card type: "+cardType(cardNumber));
			System.out.println("Credit Card Number: "+cardNumber);
			System.out.println("Credit Card Validty: "+cardValidity(array));
			System.out.println("Credit Card Length is: "+cardLength(array));
			System.out.print("THANK YOU");
		}
		
	}

	public static String cardType(String cardNumber){
		 if(cardNumber.startsWith("4")){
			return "Visa Card";

		}else if(cardNumber.startsWith("5")){
			return "Master Card";

		}else if(cardNumber.startsWith("37")){
			return "AmericanExpress Cards";

		}else if(cardNumber.startsWith("6")){
			return "Discover Cards";
		}else{
			return "INVALID CARD";
		}
	}
	public static String cardValidity(int[] array){
		int sum = 0;
		int oddNum = 0;
	
		for (int count = 0; count < array.length; count++) {
			if (count % 2 == 0) {
				int num = array[count] * 2;

				if (array[count] < 5) {
					sum += num;
				}else{
					int digit = num % 10;
					int digit2 = num /10;
					int preSum = digit + digit2;
					sum += preSum;
				}
			}else{
				oddNum += array[count];
			}
		}
		if ((sum + oddNum) % 10 == 0) {
			return "VALID";
		}else{
			return "INVALID";
		}
		
	}
	public static int cardLength(int[] array){
		int length = array.length;
		return length;	
	}
}