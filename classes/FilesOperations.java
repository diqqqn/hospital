package classes;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class FilesOperations implements interfaces.FileRead, interfaces.FileWrite {

    @Override
    public void fWrite(String filePath, User users) {
        try {
            PrintStream fileWriter = new PrintStream(filePath);
            fileWriter.println(users.toString());
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
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }

    }

}
