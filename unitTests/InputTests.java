package unitTests;

import classes.Doctor;
import classes.Menu;
import classes.Patient;
import classes.User;
import classes.enumclasess.Specialty;
import org.junit.jupiter.api.Test;

public class InputTests {

    @Test
    void isUserLogInCorrect() {
        User testUser = new User("testName", "testLastName") {
            @Override
            public int getId() {
                return super.getId();
            }

            @Override
            public void setId(int id) {
                super.setId(id);
            }

            @Override
            public String getFirstName() {
                return super.getFirstName();
            }

            @Override
            public void setFirstName(String firstName) {
                super.setFirstName(firstName);
            }

            @Override
            public String getLastName() {
                return super.getLastName();
            }

            @Override
            public void setLastName(String lastName) {
                super.setLastName(lastName);
            }

            @Override
            public String toString() {
                return super.toString();
            }
        };
    }
    @Test
    void isDoctorLogInCorrect() {
        Doctor testDoctor = new Doctor("doctorFirstName", "doctorLastName", Specialty.NEUROLOGY);

        }

    @Test
    void isPatientLogInCorrect() {
        Patient testPatient=new Patient("patientName", "patientLstName", "100");

    }
    @Test
    void isMenuStarting() {
        Menu.Show();
    }
}
