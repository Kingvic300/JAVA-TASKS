package assignments;

import java.util.Scanner;
public  class Compare{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("input first number:");
	int number = input.nextInt();
	System.out.println("input second number:");
	int digit = input.nextInt(); 
	if(number==digit){
		System.out.print("0");
	}else if(number>digit){
		System.out.print("1");
	}else if(number<digit){
		System.out.print("-1");
	}
	}
} 