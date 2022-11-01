package classes;

public abstract class Users {
    protected int id;
    protected String firstName;
    protected String lastName;

    public Users(int id, String firstName, String listName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
