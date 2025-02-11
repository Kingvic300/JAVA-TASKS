package assignments;

import java.util.Scanner;
public class lettercounter{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("enter your name");
	String str = input.next();
	letterCounter(str);
}
	public static void letterCounter(String str){
	int length = str.length();
	System.out.println("number of letters are " + length); 
	
	} 
} 