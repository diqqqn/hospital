package classes;

public class Doctor extends Users {
    Specialty sp;

    public Doctor(int id, String firstName, String listName, Specialty sp) {
        super(id, firstName, listName);
        this.sp = sp;
    }

    @Override
    public void fRead(String filePath) {
        // TODO Auto-generated method stub

    }

    @Override
    public void fWrite() {
        // TODO Auto-generated method stub

    }

}
