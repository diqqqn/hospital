package classes;

import java.util.Scanner;

public class Menu {
    public static void LogIn(){
        Scanner sc=new Scanner(System.in);
        int role = 0;
        do{
            System.out.println("Enter your role: ");
            System.out.println("[1] Doctor: ");
            System.out.println("[2] Patient: ");
            role = sc.nextInt();
        }while(role>2 || role<1);
        System.out.println("exit");

    }
}
