public class TrianglePatterns{
	public static void main(String[] args){

		for(int count = 1; count <=5; count++){
			for(int counter = 1; counter <= count; counter++){
				
				if(counter%2==0){
					System.out.print(" "+"*"+" "+" ");
				}
				if(counter%2!=0){
					System.out.print(counter);
				}		
			}
				System.out.println();
		}
		for(int count = 5; count >=1; count--){
			for(int counter = 1; counter <= count; counter++){
				
				if(counter%2==0){
					System.out.print(" "+"*"+" "+" ");
				}
				if(counter%2!=0){
					System.out.print(counter);
				}		
			}
				System.out.println();
		}


	}
}