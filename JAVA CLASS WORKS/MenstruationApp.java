import java.time.LocalDate;
import java.util.Scanner;

public class MenstruationApp {
    private LocalDate lastMenstrualFlowDate;

    public void setLastMenstrualFlow(String lastFlow){
        this.lastMenstrualFlowDate = LocalDate.parse(lastFlow);
    }


    public LocalDate getNextMenstrualFlow(){

        return lastMenstrualFlowDate.plusDays(28);
    }


    public LocalDate getNextOvulationDate(){
        return lastMenstrualFlowDate.plusDays(14);
    }

    public static void main(String[] args) {
        MenstruationApp App = new MenstruationApp();
        Scanner input = new Scanner(System.in);

        System.out.println("Do you want to know about menstrual cycle");
        String response = input.nextLine();
        if(response.equalsIgnoreCase("Yes")) {

            System.out.println("Most women have their first period between the ages of 11 and 14, " + "and have regular menstrual cycle until about age 50.\n " + "The menstrual cycle typically lasts about 28 days. However it is normal to have a cycle that is a few days shorter or longer.The days of a menstrual cycle are counted from Day 1 of menstrual bleeding to day 1 of the next menstrual bleeding. \n" + "Days 1 - 5: Menses phase bleeding occurs. \n" + "Days 6 -14: Follicular phase- an egg matures on the ovarian follicle and the uterine lining prepares to receive a fertilized egg (embryo). \n" + "Day 14: Ovulation- the ovary releases the egg, which can be fertilized by a man's sperm if present. \n" + "Day 15-28: Luteal phase- the egg travels through the fallopian tubes to the uterus, if fertilized, the embryo may attach to the uterine lining and the woman will become pregnant if the egg is not fertilized, the uterine lining will shed and the cycle will begin again");
        }
            System.out.println();

            System.out.println();

            System.out.println("Do you want to know your next menstrual flow?");
            String nextPeriod = input.nextLine();
            if(nextPeriod.equalsIgnoreCase("Yes")) {


                System.out.print("Enter your menstruation last flow date: (format: yyyy-month-day): ");
                String date = input.nextLine();
                App.setLastMenstrualFlow(date);
            }
                System.out.println("your next menstruation flow will start on "+ App.getNextMenstrualFlow());

                System.out.println();

                System.out.println("Do you have cramps? if yes, do you want to know the best position to sleep when you have menstrual cramps?");
                String sleepingPosition = input.nextLine();
                if(sleepingPosition.equalsIgnoreCase("Yes")) {

                    System.out.println("Sleeping on the back side can reduce discomfort and improve sleep quality during menstruation.\n " + "Periods typically lasts 3-5 days, although this can vary between individuals.Research has shown that sleeping on the back can also reduce back pains. As such, this position may relieve lower back pain associated with menstrual cramps");

                }
                    System.out.println("your ovulation date is :" + " " + "\n" + App.getNextOvulationDate());
                        System.out.println("However note ovulation does not always occur on the same day every month and can vary by a day or more on either side of the expected date");

                    System.out.println("Do you want to know about ovulation?");
                    String ovulation = input.nextLine();
                    if(ovulation.equalsIgnoreCase("Yes")){


                        System.out.print("Ovulation occurs when one of the ovaries releases an egg. After release, the egg moves to the fallopian tube, where it will travel to the uterus, which takes about 24 hours. Pregnancy occurs if sperm travels to the fallopian tube and fertilizes the egg. if sperm does not fertilize the egg, the egg moves to the uterus and breaks down, ready to leave the body during the next menstrual period.\n " + "A woman with 32 days between two menstruations ovulates around 18 days after the first day of the last menstruation.Thus,the safe periods are from the first day of the last menstruation and 14 days");


                    }




    }
}