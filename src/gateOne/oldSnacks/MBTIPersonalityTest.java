package oldSnacks;

import java.util.Arrays;
import java.util.Scanner;

public class MBTIPersonalityTest {
    public static void main(String[] args) {
        System.out.println("Choose Either A or B ");
        String[] answers = new String[20];
        String [] chosen = new String[4];
        String[][] arr = {
                { "(A:)  Expend energy, enjoy groups", "\t", " (B:)  Conserve energy, enjoy one-on-one"},
                {"(A:)  Interpret literally" ,"(B:)  look for meaning and possibilities"},
                {"(A:)  logical, thinking, question",  "(B:)  empathetic, feeling, accomodating"},
                {"(A:)  Organized,Orderly", "(B:)  Flexible, adaptable"},
                {"(A:)  More outgoing, think out loud", "(B:)  more reserved, think to yourself"},
                {"(A:)  Practical, realistic, experiential", "(B:)  imaginative, innovative, theoretical"},
                {"(A:)  Candid, straight-foward, frank", "(B:)  tactful, kind, encouraging"},
                {"(A:)  Plan, schedule", "(B:)  unplanned, spontaneous"},
                {"(A:)  Seek many tasks, public activities, interaction with others", "(B:)  seek private, solitary activities with quiet to concentrate"},
                {"(A:)  Standard, usual, conventional", "(B:)  different, novel, unique"},
                {"(A:)  Firm, tend to criticize, hold the line", "(B:)  gentle, tend to appreciate, conciliation"},
                {"(A:)  Regulated, structured", "(B:)  easy-going, live and let live"},
                {"(A:)  External, communicate, express yourself", "(B:)  internal, reticent, keep to yourself"},
                {"(A:)  Focus on here-and-now", "(B:)  look to the future, global perspective, big picture"},
                {"(A:)  Tough-mided, just", "(B:)  tender-hearted, merciful"},
                {"(A:)  Preparation, plan ahead", "(B:)  go with the flow, adapt as you go"},
                {"(A:)  Active, initiative", "(B:)  reflective, deliberate"},
                {"(A:)  Facts, Things, What is", "(B:)  ideas, dreams, what could be, philosophical"},
                {"(A:)  Matterof facts, issue-oriented", "(B:)  sensitive, people-oriented, compassionate"},
                {"(A:)  Control, govern", "(B:)  latitude, freedom"}
        } ;


        userName();
        mainOperation(arr, answers);
        personasSum(arr, answers, chosen);
        personasSumTwo(arr, answers,chosen);
        personasSumThree(arr, answers,chosen);
        personasSumFour(arr, answers,chosen);


        System.out.println("Personality Type: " + chosen[0] + chosen[1] + chosen[2] + 	chosen[3]);

        System.out.print("*");

        if (chosen[0] == "E" && chosen[1] == "S" && chosen[2] == "F" && chosen[3] == "P"){
            System.out.println("ESFP (Entertainer) is a personality type with the Extraverted, Observant, Feeling, and Prospecting traits. These people love vibrant experiences, engaging in life eagerly and taking pleasure in discovering the unknown. They can be very social, often encouraging others into shared activities.");
        }

        if(chosen[0] == "E" &&chosen[1] == "S" && chosen[2] == "T" && chosen[3] == "P"){
            System.out.println("ESTP (Entrepreneur) is a personality type with the Extraverted, Observant, Thinking, and Prospecting traits. They tend to be energetic and action-oriented, deftly navigating whatever is in front of them. They love uncovering life’s opportunities, whether socializing with others or in more personal pursuits.");

        }

        if(chosen[0] == "I" &&chosen[1] == "S" && chosen[2] == "F" && chosen[3] == "P"){
            System.out.println("ISFP (Adventurer) is a personality type with the Introverted, Observant, Feeling, and Prospecting traits. They tend to have open minds, approaching life, new experiences, and people with grounded warmth. Their ability to stay in the moment helps them uncover exciting potentials.");

        }

        if(chosen[0] == "I" &&chosen[1] == "S" && chosen[2] == "T" && chosen[3] == "P"){
            System.out.println("ISTP (Virtuoso) is a personality type with the Introverted, Observant, Thinking, and Prospecting traits. They tend to have an individualistic mindset, pursuing goals without needing much external connection. They engage in life with inquisitiveness and personal skill, varying their approach as needed.");

        }

        if(chosen[0] == "E" &&chosen[1] == "S" && chosen[2] == "F" && chosen[3] == "J"){
            System.out.println("ESFJ (Consul) is a personality type with the Extraverted, Observant, Feeling, and Judging traits. They are attentive and people-focused, and they enjoy taking part in their social community. Their achievements are guided by decisive values, and they willingly offer guidance to others.");

        }

        if(chosen[0] == "E" &&chosen[1] == "S" && chosen[2] == "T" && chosen[3] == "J"){
            System.out.println("ESTJ (Executive) is a personality type with the Extraverted, Observant, Thinking, and Judging traits. They possess great fortitude, emphatically following their own sensible judgment. They often serve as a stabilizing force among others, able to offer solid direction amid adversity.");

        }

        if(chosen[0] == "I" &&chosen[1] == "S" && chosen[2] == "F" && chosen[3] == "J"){
            System.out.println("ISFJ (Defender) is a personality type with the Introverted, Observant, Feeling, and Judging traits. These people tend to be warm and unassuming in their own steady way. They’re efficient and responsible, giving careful attention to practical details in their daily lives.");

        }


        if(chosen[0] == "I" &&chosen[1] == "S" && chosen[2] == "T" && chosen[3] == "J"){
            System.out.println("ISTJ (Logistician) is a personality type with the Introverted, Observant, Thinking, and Judging traits. These people tend to be reserved yet willful, with a rational outlook on life. They compose their actions carefully and carry them out with methodical purpose.");

        }

        if(chosen[0] == "E" &&chosen[1] == "N" && chosen[2] == "F" && chosen[3] == "P"){
            System.out.println("ENFP (Campaigner) is a personality type with the Extraverted, Intuitive, Feeling, and Prospecting traits. These people tend to embrace big ideas and actions that reflect their sense of hope and goodwill toward others. Their vibrant energy can flow in many directions.");

        }

        if(chosen[0] == "E" &&chosen[1] == "N" && chosen[2] == "F" && chosen[3] == "J"){
            System.out.println("ENFJ (Protagonist) is a personality type with the Extraverted, Intuitive, Feeling, and Judging traits. These warm, forthright types love helping others, and they tend to have strong ideas and values. They back their perspective with the creative energy to achieve their goals.");

        }

        if(chosen[0] == "I" &&chosen[1] == "N" && chosen[2] == "F" && chosen[3] == "P"){
            System.out.println("INFP (Mediator) is a personality type with the Introverted, Intuitive, Feeling, and Prospecting traits. These rare personality types tend to be quiet, open-minded, and imaginative, and they apply a caring and creative approach to everything they do.");

        }

        if(chosen[0] == "I" &&chosen[1] == "N" && chosen[2] == "F" && chosen[3] == "J"){
            System.out.println("INFJ (Advocate) is a personality type with the Introverted, Intuitive, Feeling, and Judging traits. They tend to approach life with deep thoughtfulness and imagination. Their inner vision, personal values, and a quiet, principled version of humanism guide them in all things.");

        }

        if(chosen[0] == "E" &&chosen[1] == "N" && chosen[2] == "T" && chosen[3] == "P"){
            System.out.println("ENTP (Debater) is a personality type with the Extraverted, Intuitive, Thinking, and Prospecting traits. They tend to be bold and creative, deconstructing and rebuilding ideas with great mental agility. They pursue their goals vigorously despite any resistance they might encounter.");

        }

        if(chosen[0] == "E" &&chosen[1] == "N" && chosen[2] == "T" && chosen[3] == "J"){
            System.out.println("ENTJ (Commander) is a personality type with the Extraverted, Intuitive, Thinking, and Judging traits. They are decisive people who love momentum and accomplishment. They gather information to construct their creative visions but rarely hesitate for long before acting on them.");

        }

        if(chosen[0] == "I" &&chosen[1] == "N" && chosen[2] == "T" && chosen[3] == "P"){
            System.out.println("INTP (Logician) is a personality type with the Introverted, Intuitive, Thinking, and Prospecting traits. These flexible thinkers enjoy taking an unconventional approach to many aspects of life. They often seek out unlikely paths, mixing willingness to experiment with personal creativity.");

        }

        if(chosen[0] == "I" &&chosen[1] == "N" && chosen[2] == "T" && chosen[3] == "J"){
            System.out.println("INTJ (Architect) is a personality type with the Introverted, Intuitive, Thinking, and Judging traits. These thoughtful tacticians love perfecting the details of life, applying creativity and rationality to everything they do. Their inner world is often a private, complex one.");
        }




    }

    public static String userName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name::: ");
        String username = sc.nextLine();
        return username;
    }

    public static void mainOperation(String[][] arr, String[] answers) {
        for (int i = 0; i < arr.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println(Arrays.toString(arr[i]));
            System.out.print("Enter your choice: ");
            String input = sc.next().toUpperCase();
            if (input.equals("A") || input.equals("B")){
                answers[i] = input;
            } else {
                System.out.println("Enter correct option");
                i--;
            }

        }
    }

    public static void personasSum(String[][] arr, String[] answers, String [] chosen) {
        int extrovert = 0;
        int introvert = 0;

        for (int i = 0; i < arr.length; i += 4) {
            if (answers[i].equals("A")) {
                extrovert++;
                System.out.println(arr[i][0]);
            }
            if (answers[i].equals("B")) {
                System.out.println(arr[i][1]);
                introvert++;
            }
            if(extrovert > introvert){chosen[0] = "E";}
            if(introvert > extrovert){chosen[0] = "I";}

        }

        System.out.println("Extrovert : " + extrovert);
        System.out.println("Introvert : " + introvert);
    }

    public static void personasSumTwo(String[][] arr, String[] answers, String [] chosen) {
        int sensitive = 0;
        int intuitive = 0;
        for (int i = 1; i < arr.length; i += 4) {
            if (answers[i].equals("A")) {
                sensitive++;
                System.out.println(arr[i][0]);
            }
            if (answers[i].equals("B")) {
                System.out.println(arr[i][1]);
                intuitive++;
            }
            if(sensitive > intuitive){chosen[1] = "S";}
            if(intuitive > sensitive){chosen[1] = "N";}

        }
        System.out.println("Sensitive : " + sensitive);
        System.out.println("Intuitive : " + intuitive);
    }

    public static void personasSumThree(String[][] arr, String[] answers, String [] chosen) {
        int thinking = 0;
        int feeling = 0;
        for (int i = 2; i < arr.length; i += 4) {
            if (answers[i].equals("A")) {
                thinking++;
                System.out.println(arr[i][0]);
            }
            if (answers[i].equals("B")) {
                System.out.println(arr[i][1]);
                feeling++;
            }
            if(thinking > feeling){chosen[2] = "T";}
            if(feeling > thinking){chosen[2] = "F";}

        }
        System.out.println("Thinking : " + thinking);
        System.out.println("Feeling : " + feeling);
    }

    public static void personasSumFour(String[][] arr, String[] answers, String [] chosen) {
        int judging = 0;
        int perceptive = 0;
        for (int i = 3; i < arr.length; i += 4) {
            if (answers[i].equals("A")) {
                judging++;
                System.out.println(arr[i][0]);
            }
            if (answers[i].equals("B")) {
                System.out.println(arr[i][1]);
                perceptive++;
            }
            if(judging > perceptive){chosen[3] = "J";}
            if(perceptive > judging){chosen[3] = "P";}

        }
        System.out.println("Judging : " + judging);
        System.out.println("Perceptive : " + perceptive);
    }
}