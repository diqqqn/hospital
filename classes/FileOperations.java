package classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
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

    public void showFileDataById(String filePath, String id, boolean showNumbers) {
        try {
            int lineOfappointments = 1;
            File myFile = new File(filePath);
            Scanner myReader = new Scanner(myFile, "UTF-8");
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] arrUserDate = data.split(",");
                if (arrUserDate[1].equals(id)) {
                    String doctorName = getNameById(arrUserDate[5]);
                    if (showNumbers) {
                        System.out.println(
                                "[" + Integer.toString(lineOfappointments) + "] -" + arrUserDate[2] + " "
                                        + arrUserDate[3] + " "
                                        + arrUserDate[4] + " " + doctorName);
                        lineOfappointments++;
                    } else {
                        System.out.println(
                                arrUserDate[2] + " " + arrUserDate[3] + " " + arrUserDate[4] + " " + doctorName);
                    }
                }
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

    public void changeDateTimeOnPatientInAppointments(String id, boolean delete) {
        ArrayList<String[]> userDateTimeData = new ArrayList<>();
        int lineOfAppointmentPat = 1;
        ArrayList<String[]> allDate = new ArrayList<>();
        String filePath = "files/appointments.csv";
        File myFile = new File(filePath);

        try {

            Scanner myReader = new Scanner(myFile, "UTF-8");

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] arrUserDate = data.split(",");

                if (arrUserDate[1].equals(id)) {
                    userDateTimeData.add(arrUserDate);
                    String doctorName = getNameById(arrUserDate[5]);
                    System.out.println(
                            "[" + Integer.toString(lineOfAppointmentPat) + "] -" + arrUserDate[2] + " "
                                    + arrUserDate[3] + " "
                                    + arrUserDate[4] + " " + doctorName);
                    lineOfAppointmentPat++;
                }
                allDate.add(arrUserDate);
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }

        int choiceDateTime;
        Scanner sc = new Scanner(System.in);
        if (!delete) {

            do {
                System.out.print("[!] Choice for change: ");
                choiceDateTime = sc.nextInt();
            } while (choiceDateTime > lineOfAppointmentPat - 1 || choiceDateTime < 1);

            Scanner datesTimes = new Scanner(System.in);
            String[] dateTime = userDateTimeData.get(choiceDateTime - 1);
            String datee = dateTime[3];
            String timee = dateTime[4];
            System.out.println("old date -" + datee);
            System.out.print("Set new date: ");
            dateTime[3] = datesTimes.nextLine();
            System.out.println("old time -" + timee);
            System.out.print("Set new time: ");
            dateTime[4] = datesTimes.nextLine();

            for (var z = 0; z < allDate.size(); z++) {
                String[] Date = allDate.get(z);
                if (dateTime[0] == Date[0] && dateTime[1] == Date[1] && dateTime[2] == Date[2] && dateTime[3] == Date[3]
                        && dateTime[4] == Date[4] && dateTime[5] == Date[5]) {
                    allDate.set(z, dateTime);
                }
            }
        } else {

            do {
                System.out.print("[!] Choice for cancel: ");
                choiceDateTime = sc.nextInt();
            } while (choiceDateTime > lineOfAppointmentPat - 1 || choiceDateTime < 1);

            String[] dateTime = userDateTimeData.get(choiceDateTime - 1);
            dateTime[0] = null;
            dateTime[1] = null;
            dateTime[2] = null;
            dateTime[3] = null;
            dateTime[4] = null;
            dateTime[5] = null;

            for (var z = 0; z < allDate.size(); z++) {
                String[] Date = allDate.get(z);
                if (dateTime[0] == Date[0] && dateTime[1] == Date[1] && dateTime[2] == Date[2] && dateTime[3] == Date[3]
                        && dateTime[4] == Date[4] && dateTime[5] == Date[5]) {
                    allDate.set(z, dateTime);
                }
            }

        }
        try {
            PrintStream clearFile = new PrintStream(filePath);
            clearFile.print("");
            clearFile.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            PrintStream fileWriter = new PrintStream(new FileOutputStream(filePath, true));
            for (int i = 0; i < allDate.size(); i++) {
                String[] dataLine = allDate.get(i);
                for (var z = 0; z < dataLine.length; z++) {
                    var each = dataLine[z];
                    if (dataLine.length - 1 != z) {
                        fileWriter.print(each + ",");
                    } else {
                        fileWriter.println(each);
                    }
                }
            }
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }

    }

}
