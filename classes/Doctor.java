package classes;

import classes.enumclasess.Specialty;

public class Doctor extends User {
    private Specialty specialty;

    public Doctor(String firstName, String listName, Specialty specialty) {
        super(firstName, listName);
        this.specialty = specialty;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.getSpecialty();
    }
}
