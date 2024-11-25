public class ClassWork{
	public static void main(String[] args){
		System.out.print(Array());
	}
	public static String Array(){
		String[] sentence = {"stupid is as stupid does"};
		String[] tokens = sentence.split(" ");
		String word;
		String letters;
		for(int index = 0; index < sentence.length; index++){
			word = tokens[index];

			for(int count = 0; count < tokens.length; count++){
				String output = word.CharAt(count);
				letters = output.toUppercase(0);
			}
		} 
		return letters;


	}

}