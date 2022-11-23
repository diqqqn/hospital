package classes;

import java.util.Scanner;

public class Registration implements interfaces.Registratible {
    private FileOperations fileOperations = new FileOperations();
    private final String doctorFiles = "files/doctors.csv";
    private final String patientFiles = "files/patients.csv";

    @Override
    public void registrationUser() {
        Scanner sc = new Scanner(System.in);
        String choice;
        boolean back = true;
        PatientOperations patientOperations = new PatientOperations();
        DoctorOperations doctorOperations = new DoctorOperations();
        do {
            System.out.println("Registration like ");
            System.out.println("[1] Doctor");
            System.out.println("[2] Patient");
            System.out.println("[3] Back");
            System.out.print("[?]: ");
            choice = sc.nextLine();
            if (choice.equals("1")) {
                doctorOperations.RegistationDoctor();
            } else if (choice.equals("2")) {
                patientOperations.RegistationPatient();
            } else if (choice.equals("3")) {
                back = false;
            }

        } while (back);
    }

}
