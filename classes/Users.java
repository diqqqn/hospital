package classes;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

import interfaces.FileRead;
import interfaces.FileWrite;

public abstract class Users implements FileRead, FileWrite {
    protected int id;
    protected String firstName;
    protected String lastName;

    public Users(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
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

    @Override
    public void fWrite(String filePath, String str) {
        try {
            PrintStream fileWriter = new PrintStream(filePath);
            fileWriter.println(str);
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }

    }
}
