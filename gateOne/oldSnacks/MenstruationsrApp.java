import java.time.LocalDate;
import java.util.Scanner;
public class MenstruationsrApp {
	public static void main(String[] args){
		menstrualCalculator();
	}

	public static void menstrualCalculator(){
		Scanner input = new Scanner(System.in);

		System.out.println("Do you want to know about menstrual cycle");
			String answer = input.next();

		if(answer.equalsIgnoreCase("Yes")){
			System.out.println("The menstrual cycle is a series of changes that occur in a woman's body as part of the preparation for the possibility of pregnancy occurring. It is a cycle that usually begins between 12 and 15 years of age that continues up until menopause, which, on average, occurs at the age of 52. The menstrual cycle is typically counted from the first day of one period to the first day of the next. It is controlled by the rise and fall of hormones. The length of a woman's menstrual cycle varies. A regular menstrual cycle is considered to be a menstrual cycle where the longest and shortest cycles vary by less than 8 days. The average menstrual cycle lasts 28 days.\n"+"As part of the menstrual cycle, the lining of the uterus thickens, and an egg, which is required for pregnancy to occur, is produced. The egg is released from the ovaries in a process called ovulation, which corresponds with the time during which a woman is most fertile (~5 days before ovulation, up through 1-2 days after ovulation). If the egg is not fertilized, pregnancy cannot happen, and the lining of the uterus will shed during a menstrual period, after which the cycle restarts.\n"+"A period, a commonly used term for referring to menstruation, is a woman's regular discharge of blood and mucosal tissue that occurs as part of the menstrual cycle. Bleeding and discharge of the mucosal lining of the uterus, through the vagina, usually lasts between 2 and 7 days. It occurs in the early phases of the menstrual cycle, referred to as the menstrual phase, which begins when the egg from a previous cycle is not fertilized. Periods stop during pregnancy, and typically do not resume during the early stages of breastfeeding. Periods also eventually stop permanently during menopause, usually between the ages of 49 and 52, and can be defined as having no vaginal bleeding for a year.");
		}

		System.out.println();

		System.out.println("Do you want to calculate your menstrual cycle");
			String response = input.next();

		if(response.equalsIgnoreCase("Yes")){
			System.out.print("Enter your menstruation last flow date: :");	
				String date = input.next();
				LocalDate lastPeriod = LocalDate.parse(date);
				LocalDate nextPeriod = lastPeriod.plusDays(28);
				System.out.println("Your next menstrual cycle is  "+ nextPeriod); 	
		}
		
		System.out.println("Do you want to know about ovulation period");
			String answers = input.next();

		if(answers.equalsIgnoreCase("Yes")){
			System.out.println(" ovulation period occurs within the broader context of the menstrual cycle, which on average is about 28 days but can vary.\n"+"The phase of ovulation are\n"+"Menstrual Phase: This is when your period starts, and it typically lasts 3 to 7 days. The lining of the uterus sheds if there was no fertilized egg.\n"+"Follicular Phase: Following the menstrual phase, the body prepares an egg for release. This phase overlaps with menstruation and continues until ovulation. Hormones like estrogen rise, causing the uterine lining to thicken.\n"+"Ovulation Phase: Ovulation usually happens in the middle of the cycle, around day 14 if you have a 28-day cycle. Here, an egg is released from one of the ovaries. This egg travels down the fallopian tube towards the uterus. This is the window where conception is most likely.\n"+"Luteal Phase: Post-ovulation, the body prepares for a possible pregnancy. The corpus luteum, a temporary hormone-secreting structure, forms from the follicle and produces progesterone to maintain the uterine lining. If the egg is not fertilized, the corpus luteum breaks down, hormone levels drop, and the cycle starts over with menstruation.");
		}

		System.out.println();

		System.out.println("Do you want to calculate your next ovulation period ");
			String responses = input.next();

		if(responses.equalsIgnoreCase("Yes")){ 
			System.out.print("Enter your menstruation last flow date: (format: yyyy-month-day): ");
				String nextPeriod = input.next();
			LocalDate ovul = LocalDate.parse(nextPeriod);
			LocalDate nextOvul = ovul.plusDays(14);
			System.out.println("your next ovulation period is "+ nextOvul);
		}
	}
}