package app.entities;

public class InstituteCampus {
    private String location;
    private int enrollmentCapacity;

    public InstituteCampus(String location, int enrollmentCapacity) {
        this.location = location;
        this.enrollmentCapacity = enrollmentCapacity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getEnrollmentCapacity() {
        return enrollmentCapacity;
    }

    public void setEnrollmentCapacity(int enrollmentCapacity) {
        this.enrollmentCapacity = enrollmentCapacity;
    }
}
