package classes;

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
}
