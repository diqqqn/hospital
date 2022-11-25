package classes;

import java.util.Scanner;

public class PatientOperations {
    private FileOperations fileOperations = new FileOperations();

    private final String filePath = "files/appointments.csv";

    public void showMyAppointments(String id) {
        fileOperations.showFileDataById(filePath, id, false);
    }

    public void RegistationPatient() {
        Scanner sc = new Scanner(System.in);
        String firstName;
        String lastName;
        String age;

        do {
            System.out.print("Enter your Firstname: ");
            firstName = sc.nextLine();
            System.out.print("Enter your Lastname: ");
            lastName = sc.nextLine();
            System.out.print("Enter your age: ");
            age = sc.nextLine();
        } while (firstName.length() < 3 || lastName.length() < 3 || age.length() < 1);

        final String pacintFile = "files/patients.csv";
        Patient patient = new Patient(firstName, lastName, age);
        fileOperations.fWrite(pacintFile, patient);
    }

    public void changeDateTimeAppointments() {
        fileOperations.changeDateTimeOnPatientInAppointments(Login.globId, false);
    }

    public void removeDateTimeAppointments() {
        fileOperations.changeDateTimeOnPatientInAppointments(Login.globId, true);
    }

}
