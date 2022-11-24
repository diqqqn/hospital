package classes;

import java.util.Scanner;

public class Login implements interfaces.Loginable {

    public static String globId;
    public static String globName;

    private final String doctorFilePath = "files/doctors.csv";
    private final String patientFilePath = "files/patients.csv";
    private FileOperations fileOperations = new FileOperations();

    @Override
    public void userLogin() {
        Scanner sc = new Scanner(System.in);
        boolean checkDoctor;
        boolean checkPatient;
        String id;
        String name;

        do {
            System.out.print("Enter your id : ");
            id = sc.nextLine();
            System.out.print("Enter your name: ");
            name = sc.nextLine();
            checkDoctor = fileOperations.checkUserByIdAndNameInFile(doctorFilePath, id, name);
            checkPatient = fileOperations.checkUserByIdAndNameInFile(patientFilePath, id, name);
        } while (checkDoctor == false && checkPatient == false);

        Login.globId = id;
        Login.globName = name;

        if (checkPatient) {
            patientLog();
        }
        if (checkDoctor) {
            doctorLog();
        }
    }

    private void patientLog() {

        PatientOperations patientOperations = new PatientOperations();

        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("WELCOME " + Login.globName);
            System.out.println("[1] Show my appointments");
            System.out.println("[2] Change date time appointments");
            System.out.println("[3] Canceling an appointment");
            System.out.println("[4] Logout");
            System.out.print("[?]: ");
            choice = sc.nextInt();
        } while (choice > 4 || choice < 1);
        switch (choice) {
            case 1:
                patientOperations.showMyAppointments(globId);
                this.patientLog();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }

    }

    private void doctorLog() {

        DoctorOperations doctorOperations = new DoctorOperations();

        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("WELCOME dr." + Login.globName);
            System.out.println("[1] Show my patient hours");
            System.out.println("[2] Sorting By");
            System.out.println("[3] Logout");
            System.out.print("[?]: ");
            choice = sc.nextInt();
        } while (choice > 3 || choice < 1);

        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }

    }

}
