package app.service;

import app.entities.Enrollment;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentService {
    private List<Enrollment> enrollments;

    public EnrollmentService() {
        this.enrollments = new ArrayList<>();
    }

    public List<Enrollment> getAllEnrollments() {
        return enrollments;
    }

    public List<Enrollment> getAllEnrollmentsByCampusLocation(String campusLocation) {
        List<Enrollment> enrollmentListByCampus = new ArrayList<>();
        for (Enrollment enrollment : enrollments) {
            if(enrollment.getCampusSelected().getLocation().equalsIgnoreCase(campusLocation)) {
                enrollmentListByCampus.add(enrollment);
            }
        }
        return enrollmentListByCampus;
    }

    public void addEnrollment(Enrollment enrollment) {
        enrollments.add(enrollment);
    }

    public void addAllEnrollments(List<Enrollment> newEnrollment) {
        enrollments.addAll(newEnrollment);
    }

    public void removeEnrollment(Enrollment enrollment) {
        enrollments.remove(enrollment);
    }
}
