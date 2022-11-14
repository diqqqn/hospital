package classes;
import classes.User;
import java.util.Scanner;

public class Menu {
    public static void LogIn() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you role: ");
        System.out.println("[1] Doctor: ");
        System.out.println("[2] Patient: ");
        short role= scan.nextShort();
        scan.close();
//        if (role==1) {
//            //Doctor id,firstName,lastName
//            //Doctor doctor = new Doctor();
//        } else if (role==2) {
//            //Patient id,firstName,lastName
//            //Patient patient = new Patient();
//        }
//        else {
//            //throw new ArrayIndexOutOfBoundsException("Invalid role number!");
//        }


//        Scanner sc = new Scanner(System.in);
//        int role = 0;
//        do {
//            System.out.println("Enter your role: ");
//            System.out.println("[1] Doctor: ");
//            System.out.println("[2] Patient: ");
//            role = sc.nextInt();
//        } while (role > 2 || role < 1);
//        sc.close();
//        System.out.println("exit");

    }
}
