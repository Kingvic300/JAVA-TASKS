import java.util.Arrays;
import java.util.Scanner; 
public class PersonalityTest{
	public static void main(String[] args){
		System.out.println("Below are lists of questions you are to choose between A and B");
		String[] answers = new String[20];
	
		String[][] questions = {{" A. Expend energy, enjoy groups"," B. Conserve energy, enjoy one-on-one"},

					{" A. Interpret literally"," B. look for meaning and possibilities"},

					{" A. logical, thinking, questioning"," B. empathetic, feeling, accommodating"},

					{" A. organized, orderly"," B. flexible, adoptable"},
		
					{" A. more outgoing, think out loud"," B. more reserved, think to yourself"},

					{" A. practical, realistic, experiential"," B. imaginative, innovative, theoretical"},

					{" A. candid, straight forward, frank"," B. tactful, kind, encouraging"},

					{" A. plan, schedule"," B. unplanned, spontaneous"},

					{" A. seek many tasks, public activities, interaction with others"," B. seek private, solitary activities with quiet to concentrate"},

					{" A. standard, usual, conventional"," B. different, novel, unique"},

					{" A. firm, tend to criticize, hold the line"," B. gentle, tend to appreciate, conciliate"},

					{" A. regulated, structured"," B. easy going, live and let live"},

					{" A. external, communicative, express yourself"," B. internal, reticent, keep to yourself"},
					
					{" A. focus on here and now"," B. look to the future, global perspective, big picture"},
		
					{" A. tough-minded, just"," B. tender-hearted, merciful"},
			
					{" A. preparation, plan ahead"," B. go with the flow, adapt as you go"},
		
					{" A. active initiate"," B. reflective, deliberate"},

					{" A. facts things what is"," B. ideas dreams, what would be, philosophical"},

					{" A. matter of fact issue-oriented"," B. sensitive, people-oriented, compassionate"},
		
					{" A. control, govern"," B. latitude, freedom"}};

				printQuestions(questions,answers);


	}

	public static void printQuestions(String[][] questions, String[] answers){ 

		for(int row = 0; row < questions.length; row++){

			Scanner input = new Scanner(System.in);

			System.out.println(Arrays.toString(questions[row]));	
			
				String answer = " ";

			while (true) {
				System.out.println("Enter your choice");
					answer = input.next().toUpperCase(); 
				if(answer.equals(" ")){
					break;
				}

				if(answer.equals("A") || answer.equals("B")){
					break;
				}
			}
			answers[row] = answer;
		}
	}
}