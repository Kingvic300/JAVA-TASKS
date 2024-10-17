import java.util.Arrays; 
public class StringCharacters{
	public static void main(String[] args){
		System.out.print(Characters("Victor"));
	}
	public static boolean Characters(String words){
		for(int count = 0;count<words.length();count++){ 
			for(int counter = 1; counter<words.length();counter++){
				if(words.charAt(counter -1) == words.charAt(counter)){
					return false;
				}
			}
		}
		return true;		 
	}
}