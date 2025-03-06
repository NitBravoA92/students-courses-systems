package app.entities;

public class Teacher extends Person {
    private String genre;
    private String maritalStatus;
    private String degree;
    private int yearsOfExperience;
    private String workSchedule;
    private String workingModality;
    private int hoursPerWeek;

    private Teacher(String firstName, String lastName, String email, String residenceCity, String genre, String maritalStatus, String degree, int yearsOfExperience, String workSchedule, String workingModality, int hoursPerWeek) {
        super(firstName, lastName, email, residenceCity);
        this.genre = genre;
        this.maritalStatus = maritalStatus;
        this.degree = degree;
        this.yearsOfExperience = yearsOfExperience;
        this.workSchedule = workSchedule;
        this.workingModality = workingModality;
        this.hoursPerWeek = hoursPerWeek;
    }

    public String getGenre() {
        return genre;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public String getDegree() {
        return degree;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public String getWorkSchedule() {
        return workSchedule;
    }

    public String getWorkingModality() {
        return workingModality;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public boolean isGraduated() {
        return degree != null && !degree.isEmpty();
    }

    // Builder class inside Teacher
    public static class Builder {
        private String firstName;
        private String lastName;
        private String email;
        private String residenceCity;
        private String genre;
        private String maritalStatus;
        private String degree;
        private int yearsOfExperience;
        private String workSchedule;
        private String workingModality;
        private int hoursPerWeek;

        public Builder(String firstName, String lastName, String email, String residenceCity, String workSchedule, String workingModality, int hoursPerWeek) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.residenceCity = residenceCity;
            this.workSchedule = workSchedule;
            this.workingModality = workingModality;
            this.hoursPerWeek = hoursPerWeek;
        }

        public Builder genre(String genre) {
            this.genre = genre;
            return this;
        }

        public Builder yearsOfExperience(int yearsOfExperience) {
            this.yearsOfExperience = yearsOfExperience;
            return this;
        }

        public Builder maritalStatus(String maritalStatus) {
            this.maritalStatus = maritalStatus;
            return this;
        }

        public Builder degree(String degree) {
            this.degree = degree;
            return this;
        }

        public Teacher build() {
            return new Teacher(firstName, lastName, email, residenceCity, genre, maritalStatus, degree, yearsOfExperience, workSchedule, workingModality, hoursPerWeek);
        }
    }
}
