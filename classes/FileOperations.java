package classes;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class FileOperations implements interfaces.FileRead, interfaces.FileWrite {
    public static int numberOfLine = 0;

    @Override
    public void fWrite(String filePath, User users) {
        try {
            PrintStream fileWriter = new PrintStream(filePath);
            String userData = Integer.toString(numberOfLine) + "," + users.toString();
            fileWriter.println(userData);
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
    }

    @Override
    public void fRead(String filePath) {
        try {
            File myFile = new File(filePath);
            Scanner myReader = new Scanner(myFile, "UTF-8");

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                numberOfLine++;
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }

    }

}
