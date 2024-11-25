import java.util.Scanner;
public class DecreasingOrder{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number:");
		double digit1 = input.nextDouble();

		System.out.print("Enter a number:");
		double digit2 = input.nextDouble();

		System.out.print("Enter a number:");
		double digit3 = input.nextDouble();
 
		numberdisplay(digit1,digit2,digit3);
	}
	public static void numberdisplay(double num1,double num2,double num3){
		boolean compare1 = num1 >= num2;
		boolean compare2 = num2 >= num3;
		if(compare1 && compare2){
			if(compare2){
				System.out.println(num1+" "+num2+" "+num3);
			}else {
				System.out.println(num1 + " " + num3 + " " + num2);
			}
		}else if(num2>=num1 && num2>=num3){
        	if(num1>=num3){
          		System.out.println(num2+" "+num1+" "+num3);
        	}else{
           		System.out.println(num2+" "+num3+" "+num1);
			}
		}else{
			if (num1>=num2) {
				System.out.println(num3 + " " + num1 + " " + num2);
			}else{
				System.out.println(num3+" "+num2+" "+num1);
			}
		}
	}
}