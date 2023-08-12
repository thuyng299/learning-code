public class Instructor {
    private String firstName;

    private String lastName;

    private String officeNo;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Instructor(String firstName, String lastName, String officeNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeNo = officeNo;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOfficeNo() {
        return officeNo;
    }

    public void setOfficeNo(String officeNo) {
        this.officeNo = officeNo;
    }
}
