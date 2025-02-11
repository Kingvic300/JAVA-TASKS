
import java.util.ArrayList;

public class Doctor {

    private String name;
    private String specialization;
    private ArrayList<Appointment> schedule = new ArrayList<>();
    private ArrayList<Appointment> appointmentHistory = new ArrayList<>();
    private int freeTime = 9;
    private int freeDay = 21;
    private int freeMonth = 1;


    public Doctor (String name,String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public void updateSchedule(Appointment appointment) {
        freeTime += 1;
        if( freeTime % 17 == 0 ){
            freeDay += 1;
        }
        schedule.add(appointment);
    }
    public ArrayList<Appointment> getSchedule() {
        return schedule;
    }

    public void reviewSchedule(){
        for( Appointment appointment : schedule ){
            appointment.display();
        }
    }

    public void reviewMedicalHistory(){
        for( Appointment appointment : appointmentHistory ){
            appointment.display();
        }
    }

    public String getName() {
        return name;
    }
    public String getSpecialization() {
        return specialization;
    }

    public int get_freeTime() {
        return freeTime % 17;
    }

    public int getFreeDay() {
        return freeDay % 28;
    }
    public int getFreeMonth() {
        return freeMonth%12;
    }

    public void validateDoctorInformation(String specialization) {
        if (specialization == null){
            throw new IllegalArgumentException("Invalid specialization");
        }
    }
}