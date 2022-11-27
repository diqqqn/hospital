package unitTests;

import classes.User;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class FileOperationsTests {
    private int numberOfLine;

    @Test
    public void testFileRead(String filePath, boolean printOnConsole) {
        numberOfLine = 1;
        try {
            File testFile = new File(filePath);
            Scanner testReader = new Scanner(testFile, "UTF-8");

            while (testReader.hasNextLine()) {
                String data = testReader.nextLine();
                if (printOnConsole) {
                    System.out.println(data);
                }
                this.numberOfLine++;
            }
            testReader.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
    }
    @Test
    public void testFileWrite(String filePath, User testUser) {
        testFileRead(filePath, false);
        testUser.setId(numberOfLine);
        try {
            PrintStream fileWriter = new PrintStream(new FileOutputStream(filePath, true));
            String userData = testUser.toString();
            fileWriter.println(testUser.getId() + "," + userData);
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
    }
}
//    @Test
//    @Override
//    public void fRead(String filePath, boolean printOnConsole) {
//
//    }
//}
