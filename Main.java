import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import classes.Doctor;
import classes.FileOperations;
import classes.Login;
import classes.Menu;
import classes.Patient;
import classes.enumclasess.Specialty;

public class Main {
    public static void main(String[] args) {

        // FileOperations doctorWriteInFile = new FileOperations();
        // FileOperations patientWriteInFile = new FileOperations();
        // Doctor dc = new Doctor("doctor1", "doctor1", Specialty.GASTROENTEROLOGY);
        // Patient pt = new Patient("dd", "ii","22");
        // doctorWriteInFile.fWrite("files/doctors.csv", dc);
        // patientWriteInFile.fWrite("files/patients.csv", pt);

        // LocalDate date = LocalDate.now();
        // DateTimeFormatter formatters = DateTimeFormatter.ofPattern("d-MM-uuuu");
        // String text = date.format(formatters);
        // LocalDate parsedDate = LocalDate.parse(text, formatters);
        //
        // System.out.println("date: " + date);
        // System.out.println("Text format " + text);
        // System.out.println("parsedDate: " + parsedDate.format(formatters));

        Menu menu = new Menu();
        menu.LogIn();
    }
}
