package unitTests;

import org.junit.jupiter.api.Test;
import java.io.File;
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
}
//    @Test
//    @Override
//    public void fRead(String filePath, boolean printOnConsole) {
//
//    }
//}
