public class Index{
	public static void main(String[] args){
		even();
		odd();
	}
	public static void even(){
		int [] array = {10,23,34,56,78,97};
			System.out.println("even position");  
		for(int count=0;count<array.length;count+=2){
			System.out.println(array[count]); 
		}
	}
	
	public static void odd(){
		int [] array = {10,23,34,56,78,97};
		System.out.println("odd position"); 
		for(int count=1;count<array.length;count+=2){
			System.out.println(array[count]); 
		}
	}

	
}