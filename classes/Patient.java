package classes;

public class Patient extends User {
    private String age;

    public Patient(String firstName, String listName, String age) {
        super(firstName, listName);
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.getAge();
    }
}
