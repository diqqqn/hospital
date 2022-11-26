//package unitTests;
//
//import classes.User;
//import org.junit.jupiter.api.Test;
//
//import java.io.FileOutputStream;
//import java.io.PrintStream;
//
//public class FileOperationsTests implements interfaces.FileRead, interfaces.FileWrite {
//    @Test
//    void areFileOperationsCorrect() {
//        protected int numberOfLine = 1;
//
//        @Override
//        public void fWrite(String filePath, User users) {
//            fRead(filePath, false);
//            users.setId(numberOfLine);
//            try {
//                PrintStream fileWriter = new PrintStream(new FileOutputStream(filePath, true));
//                String userData = users.toString();
//                fileWriter.println(users.getId() + "," + userData);
//                fileWriter.close();
//            } catch (Exception e) {
//                System.out.println("ERROR: " + e);
//            }
//        };
//    }
//}

