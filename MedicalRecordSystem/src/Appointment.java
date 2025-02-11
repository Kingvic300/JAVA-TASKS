import java.sql.Time;
import java.util.Date;


public class Appointment {

    private Doctor doctor;
    private Time appointmentTime;
    private Date appointmentDate;
    private String patientName;
    private boolean isCompleted;
    private String description;


    public Appointment(Date date, Time time, Doctor doctor,String patientName ,String description) {
        this.appointmentDate = date;
        this.appointmentTime = time;
        this.doctor = doctor;
        this.patientName = patientName;
        isCompleted = false;
        this.description = description;
    }

    public void display() {
        System.out.printf("Patient: %s\nDate: %s\ntime: %s\ndescription: %s\n" +
                "doctor: %s\n",patientName,appointmentDate,appointmentTime,description,doctor.getName());
    }

    public String getDescription( ) {
        return description;
    }
    public Date getDate( ) {
        return appointmentDate;
    }
    public Time getTime( ) {
        return appointmentTime;
    }
    public String  getPatientName( ) {
        return patientName;
    }
    public void setDate(Date newdate) {
        appointmentDate = newdate;
    }

    public void setTime( Time newtime) {
        appointmentTime = newtime;
    }
    public boolean isCompleted( ) {
        return isCompleted;
    }
    public void complete( ) {
        isCompleted = true;
    }
}