package classes;

public class Appointments extends User {

    Examinations examinations;
    String date;
    String time;

    public Appointments(int id, String patientId, String doctorId, Examinations examinations, String date,
            String time) {
        super(id, patientId, doctorId);
        this.examinations = examinations;
        this.date = date;
        this.time = time;
    }

}
