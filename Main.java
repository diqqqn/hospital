import classes.Doctor;
import classes.FileOperations;
import classes.Patient;
import classes.enumclasess.Specialty;

public class Main {
    public static void main(String[] args) {

        FileOperations doctorWriteInFile = new FileOperations();
        FileOperations patientWriteInFile = new FileOperations();
        Doctor dc = new Doctor("doctor1", "doctor1", Specialty.GASTROENTEROLOGY);
        Patient pt = new Patient("dd", "ii");
        doctorWriteInFile.fWrite("files/doctors.csv", dc);
        patientWriteInFile.fWrite("files/patients.csv", pt);
    }
}
