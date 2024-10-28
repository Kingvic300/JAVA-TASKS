public class TrianglePrintingProgram{
	public static void main(String[] args){
		PatternA();
		//PatternB();
		//PatternC();
	}
	public static void PatternA(){
		for(int count = 0; count<=10;count++){
			System.out.println(); 
			for(int counter =  0;counter<count;counter++){
				System.out.print("*");
			}
		}
	}
	public static void PatternB(){
		for(int count = 0; count<=10;count++){
			System.out.println(); 
			for(int counter =  count;counter<=10;counter++){
				System.out.print("*");
			}
		}
	}
	public static void PatternC(){
		for(int count = 0; count<=10;count++){
			System.out.print(""); 
			for(int counter =  10-count;counter>0;counter--){
				System.out.print("*");
			}
			for(int counts = 0; counts<=count;counts++){
				System.out.print("");
			}
			System.out.println();	 
		}

	}
}