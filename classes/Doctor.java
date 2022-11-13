package classes;

public class Doctor extends User {
    private Specialty specialty;

    public Doctor(int id, String firstName, String listName, Specialty specialty) {
        super(id, firstName, listName);
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
