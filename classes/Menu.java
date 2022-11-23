package classes;

import java.util.Scanner;

public class Menu {
    public static void LogIn() {
        Login login = new Login();

        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            try {
                System.out.println("[1] Login");
                System.out.println("[2] Registration");
                System.out.println("[3] Exit");
                System.out.print("[?]: ");
                choice = sc.nextLine();

                if (choice.equals("1")) {
                    login.userLogin();
                } else if (choice.equals("2")) {
                    Registration rg = new Registration();
                    rg.registrationUser();
                } else if (choice.equals("3")) {
                    System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("ERROR input");
            }

        } while (true);

    }
}
