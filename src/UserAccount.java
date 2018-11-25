import java.util.Random;

public class UserAccount extends Person {

    /*
     * 
     * Inheritance is when one class inherits the fields and methods of another
     * class. A benefit of inheritance is not having to rewrite code if you have
     * several classes that have identical fields or methods.
     * 
     */

    private int userID;

    public void createUserID() {
        Random rand = new Random();
        userID = rand.nextInt(101);
    }

    public int getUserID() {
        return userID;
    }

    public String selfDescription() {
        String description = super.selfDescription();

        description += "Their user ID is " + getUserID() + ".";

        return description;
    }

    public UserAccount() {
        setFirstName("Guest");
        setLastName("");
        setGender("Unknown");
        setAge(0);
    }

    public UserAccount(String fname, String lname, String gender, int age) {
        setFirstName(fname);
        setLastName(lname);
        setGender(gender);
        setAge(age);
    }

}
