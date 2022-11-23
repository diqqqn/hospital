package classes;

import java.util.Scanner;

import classes.enumclasess.Specialty;

public class DoctorOperations {
    private FileOperations fileOperations = new FileOperations();

    public void RegistationDoctor() {
        Scanner sc = new Scanner(System.in);
        String firstName;
        String lastName;
        Specialty specialty;

        do {
            System.out.print("Enter your Firstname: ");
            firstName = sc.nextLine();
            System.out.print("Enter your Lastname: ");
            lastName = sc.nextLine();
            for (Specialty specialty2 : Specialty.values()) {
                System.out.println("[" + specialty2.ordinal() + "] - " + specialty2);
            }
            System.out.print("Enter your specialty: ");
            int x = sc.nextInt();
            specialty = Specialty.values()[x];
        } while (firstName.length() < 3 || lastName.length() < 3);

        final String pacintFile = "files/doctors.csv";
        Doctor doctor = new Doctor(firstName, lastName, specialty);
        fileOperations.fWrite(pacintFile, doctor);
    }

}
