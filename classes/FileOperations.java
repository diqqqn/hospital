package classes;

import java.io.File;
import java.io.FileNotFoundException;
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

    public Boolean checkUserByIdAndNameInFile(String filePath, String id, String name) {
        try {
            File myFile = new File(filePath);
            Scanner myReader = new Scanner(myFile, "UTF-8");

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] arrUserDate = data.split(",");

                if (arrUserDate[0].equals(id) && arrUserDate[1].equals(name)) {
                    return true;
                }

            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }

        return false;
    }

    public void showFileDataById(String filePath, String id) {
        try {
            File myFile = new File(filePath);
            Scanner myReader = new Scanner(myFile, "UTF-8");

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] arrUserDate = data.split(",");
                if (arrUserDate[1].equals(id)) {
                    String doctorName = getNameById(arrUserDate[5]);
                    System.out.println(
                            arrUserDate[2] + " " + arrUserDate[3] + " " + arrUserDate[4] + " " + doctorName);
                }
                this.numberOfLine++;
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
    }

    public String getNameById(String id) throws FileNotFoundException {
        String filePath = "files/doctors.csv";
        File myFile = new File(filePath);
        Scanner myReader = new Scanner(myFile, "UTF-8");
        String doctorName = "NONE";

        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            String[] arrUserDate = data.split(",");
            if (arrUserDate[0].equals(id)) {
                return arrUserDate[1];
            }
        }
        return doctorName;
    }

}
