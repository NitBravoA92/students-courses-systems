package app.entities;

public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private String residenceCity;

    public Person() {}

    public Person(String firstName, String lastName, String email, String residenceCity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.residenceCity = residenceCity;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstLastName() {
        return firstName + " " + lastName;
    }

    public String getLastFirstName() {
        return lastName + " " + firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getResidenceCity() {
        return residenceCity;
    }

    public void setResidenceCity(String residenceCity) {
        this.residenceCity = residenceCity;
    }
}
