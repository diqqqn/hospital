package classes;

import java.util.Scanner;

import classes.enumclasess.Examinations;
import classes.enumclasess.Specialty;

public class DoctorOperations {
    private FileOperations fileOperations = new FileOperations();

    public void RegistationDoctor() {
        Scanner sc = new Scanner(System.in);
        String firstName;
        String lastName;
        Specialty specialty;
        int x = -1;
        do {
            System.out.print("Enter your Firstname: ");
            firstName = sc.nextLine();
            System.out.print("Enter your Lastname: ");
            lastName = sc.nextLine();
            for (Specialty specialty2 : Specialty.values()) {
                System.out.println("[" + specialty2.ordinal() + "] - " + specialty2);
            }
            System.out.print("Enter your specialty: ");
            x = sc.nextInt();
            specialty = Specialty.values()[x];
        } while (firstName.length() < 3 || lastName.length() < 3 || x > 14 || x < 0);

        final String pacintFile = "files/doctors.csv";
        Doctor doctor = new Doctor(firstName, lastName, specialty);
        fileOperations.fWrite(pacintFile, doctor);
        System.out.println("REGISTRATION IS SUCCESSFUL");
    }

    public void showMyPatintHours(String id) {
        String filePath = "files/appointments.csv";
        fileOperations.showFileDataById(filePath, id, false, true);
    }

    public void addAppointments(String doctorId) {
        String filePath = "files/appointments.csv";
        Scanner sc = new Scanner(System.in);
        int patientId;

        fileOperations.fRead("files/patients.csv", true);
        do {
            System.out.print("Choice patient :");
            patientId = sc.nextInt();
        } while (patientId >= fileOperations.numberOfLine);

        int examination;
        Examinations examinations;
        do {

            for (Examinations examinations2 : Examinations.values()) {
                System.out.println("[" + examinations2.ordinal() + "] - " + examinations2);
            }
            System.out.print("Choice examinations: ");
            examination = sc.nextInt();
            examinations = Examinations.values()[examination];
        } while (examination > 3 || examination < 0);

        Scanner datetime = new Scanner(System.in);
        System.out.print("Enter date in format dd-mm-yyyy: ");
        String date = datetime.nextLine();
        System.out.print("Enter time in format hhmm: ");
        String time = datetime.nextLine();
        Appointments appointments = new Appointments(Integer.toString(patientId), examinations, date, time, doctorId);
        fileOperations.fWrite(filePath, appointments);

    }

}
