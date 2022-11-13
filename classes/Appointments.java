package classes;

public class Appointments extends User {

    private Examinations examinations;
    private String date;
    private String time;
    Doctor doctor;

    public Appointments(int id, String patientId, String doctorId, Examinations examinations, String date,
            String time, Doctor doctor) {
        super(id, patientId, doctorId);
        this.examinations = examinations;
        this.date = date;
        this.time = time;
        this.doctor = doctor;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Examinations getExaminations() {
        return examinations;
    }

    public void setExaminations(Examinations examinations) {
        this.examinations = examinations;
    }

    @Override
    public String toString() {
        return super.toString() + "," + getExaminations() + "," + getDate() + "," + getTime() + ","
                + this.doctor.getId();
    }

}
