package classes;

import classes.enumclasess.Examinations;

public class Appointments extends User {

    private Examinations examinations;
    private String date;
    private String time;
    private String doctorId;
    private String patinentId;

    public Appointments(String patientId, Examinations examinations, String date,
            String time, String doctorId) {
        super(patientId, doctorId);
        this.patinentId = patientId;
        this.examinations = examinations;
        this.date = date;
        this.time = time;
        this.doctorId = doctorId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPatinentId() {
        return patinentId;
    }

    public void setPatinentId(String patinentId) {
        this.patinentId = patinentId;
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

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    @Override
    public String toString() {
        return this.getPatinentId() + "," + this.getExaminations() + "," + this.getDate() + "," + this.getTime() + ","
                + this.getDoctorId();
    }

}
