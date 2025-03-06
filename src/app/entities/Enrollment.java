package app.entities;

public class Enrollment {
    private Student student;
    private Course course;
    private InstituteCampus campusSelected;
    private Teacher teacher;

    public Enrollment(Student student, Course course, InstituteCampus campusSelected, Teacher teacher) {
        this.student = student;
        this.course = course;
        this.campusSelected = campusSelected;
        this.teacher = teacher;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public InstituteCampus getCampusSelected() {
        return campusSelected;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
