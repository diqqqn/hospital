package classes;

public class Doctor extends User {
    Specialty specialty;

    public Doctor(int id, String firstName, String listName, Specialty specialty) {
        super(id, firstName, listName);
        this.specialty = specialty;
    }

}
