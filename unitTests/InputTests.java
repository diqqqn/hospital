package unitTests;

import classes.User;
import org.junit.jupiter.api.Test;

public class InputTests {

    @Test
    void isLogInCorrect() {
        User testUser= new User("testName","testLastName") {
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
}
