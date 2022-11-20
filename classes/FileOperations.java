package classes;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class FileOperations implements interfaces.FileRead, interfaces.FileWrite {
    private int numberOfLine = 1;

    @Override
    public void fWrite(String filePath, User users) {

        fRead(filePath, false);
        users.setId(numberOfLine);
        try {

            PrintStream fileWriter = new PrintStream(new FileOutputStream(filePath, true));
            String userData = users.toString();
            fileWriter.println(users.getId() + "," + userData);
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
    }

    @Override
    public void fRead(String filePath, boolean printOnConsole) {

        try {
            File myFile = new File(filePath);
            Scanner myReader = new Scanner(myFile, "UTF-8");

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (printOnConsole) {
                    System.out.println(data);
                }

                this.numberOfLine++;
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }

    }

}
