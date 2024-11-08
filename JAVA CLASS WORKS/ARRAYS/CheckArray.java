import java.util.Scanner;
public class CheckArray{
	public static void main(String[] args){
	Checker();

}
public static void Checker(){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a element:");
	int element = input.nextInt(); 
	int[] array = new int[element];
    if (array.length>0){
        System.out.println("The array is not empty.");
    } else {
        System.out.println("The array is empty.");
    }
}
}