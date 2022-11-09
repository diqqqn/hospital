package classes;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class FilesOperation implements interfaces.FileRead, interfaces.FileWrite {

    @Override
    public void fWrite(String filePath, Users users) {
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

    @Override
    public void fRead(String filePath) {
        String str = " ";
        try {
            PrintStream fileWriter = new PrintStream(filePath);
            fileWriter.println(str);

            fileWriter.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }

    }

}
