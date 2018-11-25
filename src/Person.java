public class Person {

    private String firstName;
    private String lastName;
    private String gender;
    private int age;

    public void setFirstName(String fname) {
        this.firstName = fname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lname) {
        this.lastName = lname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setGender(String gen) {
        this.gender = gen;
    }

    public String getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {
        String fullName = firstName + " " + lastName;
        return fullName;
    }

    public String selfDescription() {
        String description = "";

        description += this.getFullName() + " is a " + this.getAge()
                + " year old " + this.getGender() + ".\n";

        return description;
    }
}
