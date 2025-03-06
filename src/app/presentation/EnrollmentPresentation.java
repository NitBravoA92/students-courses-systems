package app.presentation;

import app.entities.Enrollment;
import app.service.EnrollmentService;

import java.util.List;

public class EnrollmentPresentation {
    private EnrollmentService service;

    public EnrollmentPresentation(EnrollmentService service) {
        this.service = service;
        printHeader();
    }

    public void showEnrollments() {
        this.printEnrollmentList(this.service.getAllEnrollments());
    }

    public void showEnrollmentsByCampusLocation(String location) {
        this.printEnrollmentList(this.service.getAllEnrollmentsByCampusLocation(location));
    }

    private void printEnrollmentList(List<Enrollment> enrollments) {
        int counter = 1;
        for (Enrollment enrollment : enrollments) {
            System.out.println(counter + ".......................................");
            this.printEnrollment(enrollment);
            counter++;
        }
    }

    private void printEnrollment(Enrollment enrollment) {
        System.out.println("COURSE: " + enrollment.getCourse().getName());
        System.out.println("STUDENT: " + enrollment.getStudent().getFirstLastName());
        System.out.println("TEACHER: " + enrollment.getTeacher().getFirstLastName());
        System.out.println("CAMPUS: " + enrollment.getCampusSelected().getLocation());
    }

    private void printHeader() {
        System.out.println("=====================ENROLLMENTS=====================\n");
    }
}
