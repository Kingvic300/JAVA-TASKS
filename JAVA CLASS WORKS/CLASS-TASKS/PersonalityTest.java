import java.util.Arrays;
import java.util.Scanner; 
public class PersonalityTest{
	public static void main(String[] args){
		System.out.println("Below are lists of questions you are to choose between A and B");
		String[] answers = new String[20];
		String[] choice = new String[4];
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

				questionsAndAnswers(questions,answers);
	}

	public static void questionsAndAnswers(String[][] questions, String[] answers){ 
        Scanner input = new Scanner(System.in);
		for(int count = 0; count < questions.length; count++) {
            System.out.println(Arrays.toString(questions[count]));
            System.out.println("Enter your answer");
            String answer = input.next();
            if (answer.equalsIgnoreCase("A") || answer.equalsIgnoreCase("B")) {
                answers[count] = answer;
            } else {
                System.out.println("Invalid");

            }
        }
	}
	
	public static String name(){
		Scanner input = new Scanner(System.in);    
        	System.out.println("Enter Your Name  ");
        		String name = input.next();
        	return name;
	}
	public static void personasSum(String[][] questions, String[] answers, String [] choice) {
        	int e = 0;
        	int i = 0;
	
        for (int count = 0; count < questions.length; count += 4) {
            if (answers[count].equalsIgnoreCase("A")) {
                e++;
                System.out.println(questions[count][0]);
            } else if (answers[count].equalsIgnoreCase("B")) {
                System.out.println(questions[count][1]);
                i++;
            }
            if (e > i) {
                choice[0] = "E";
            }
            if (i > e) {
                choice[0] = "I";
            }

        }
	
        System.out.println("Extrovert : " + e);
        System.out.println("Introvert: " + i);
    }

    public static void personasSu(String[][] questions, String[] answers, String [] choice) {
        int s = 0;
        int i = 0;
        for (int count = 1; count < questions.length; count += 4) {
            if (answers[count].equalsIgnoreCase("A")) {
                s++;
                System.out.println(questions[count][0]);
            }else if (answers[count].equalsIgnoreCase("B")) {
                System.out.println(questions[count][1]);
                i++;
            }
	    if(s > i){choice[1] = "S";}
	    if(i > s){choice[1] = "N";}

        }
        System.out.println("Sensitive : " + s);
        System.out.println("Intuitive : " + i);
    }

    public static void personasS(String[][] questions, String[] answers, String [] choice) {
        int t = 0;
        int f = 0;
        for (int count = 2; count < questions.length; count += 4) {
            if (answers[count].equalsIgnoreCase("A")) {
                t++;
                System.out.println(questions[count][0]);
            }else if (answers[count].equalsIgnoreCase("B")) {
                System.out.println(questions[count][1]);
                f++;
            }
	    if(t > f){choice[2] = "T";}
	    if(f > t){choice[2] = "F";}

        }
        System.out.println("t : " + t);
        System.out.println("f : " + f);
    }

    public static void personas(String[][] questions, String[] answers, String [] choice) {
        int j = 0;
        int p = 0;
        for (int count = 3; count < questions.length; count += 4) {
            if (answers[count].equalsIgnoreCase("A")) {
                j++;
                System.out.println(questions[count][0]);
            }else if (answers[count].equalsIgnoreCase("B")) {
                System.out.println(questions[count][1]);
                p++;
            }
	    if(j > p){choice[3] = "J";}
	    if(p > j){choice[3] = "P";}

        }
        System.out.println("Judging : " + j);
        System.out.println("Perceptive : " + p);
    }

}