package classes;

public class Doctor extends Users {
    Specialty sp;

    public Doctor(int id, String firstName, String listName, Specialty sp) {
        super(id, firstName, listName);
        this.sp = sp;
    }

}
