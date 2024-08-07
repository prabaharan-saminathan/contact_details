package contact_project_java;
public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

    public Contact(String firstName, String lastName, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String phoneNumber() {
        return phoneNumber;
    }

    public void phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\n  Phone: " + phoneNumber + "\nEmail: " + email;
    }
}
