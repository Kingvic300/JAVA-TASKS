import java.util.Scanner;
public class Factor{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("input a number"); 
int number = input.nextInt();

int counter = 0;
 
for(int count = 1; count <= number; count++){
if(number%count==0){ counter+=1;}


}  
System.out.print("the factors are " + counter);
}
}