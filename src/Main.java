import app.entities.*;
import app.presentation.EnrollmentPresentation;
import app.service.EnrollmentService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // LORAT Institute

        // campuses
        InstituteCampus campusValencia = new InstituteCampus("Valencia", 200);
        InstituteCampus campusMadrid = new InstituteCampus("Madrid", 700);
        InstituteCampus campusBarcelona = new InstituteCampus("Barcelona", 400);

        // Students
        Student studentCarlos = new Student("Carlos", "Alvarez", "carlos123@gmail.com", "Valencia");
        Student studentJose = new Student("Jose", "Lugo", "jose123@gmail.com", "Valencia");
        Student studentManuel = new Student("Manuel", "Vegas", "manuel123@gmail.com", "Barcelona");
        Student studentMiriam = new Student("Miriam", "Duarte", "miriam123@gmail.com", "Barcelona");
        Student studentFrank = new Student("Frank", "Sanchez", "frank123@gmail.com", "Valencia");
        Student studentMaria = new Student("Maria", "Ruiz", "maria123@gmail.com", "Madrid");
        Student studentJessica = new Student("Jessica", "Lima", "jessica123@gmail.com", "Barcelona");
        Student studentLuisa = new Student("Luisa", "Alcala", "luisa123@gmail.com", "Madrid");
        Student studentMiguel = new Student("Miguel", "Mendez", "Miguel123@gmail.com", "Madrid");
        Student studentJhon = new Student("Jhon", "Perez", "jhon123@gmail.com", "Valencia");

        // courses
        Course english = new Course("English", 3);
        Course programming = new Course("Programming", 4);
        Course dataAnalytics = new Course("Data Analytics", 3);

        // Teachers
        Teacher teacherAnthony = new Teacher.Builder("Anthony", "Parra", "anthony123@gmail.com", "Valencia", "Full-time", "On-Side", 40).maritalStatus("Single").build();
        Teacher teacherFrancisco = new Teacher.Builder("Francisco", "Rodriguez", "francisco123@gmail.com", "Malaga", "Part-time", "Remote", 20).degree("Software Engineer").yearsOfExperience(7).build();
        Teacher teacherRodrick = new Teacher.Builder("Rodrick", "Navarro", "rodrick123@gmail.com", "Madrid", "Full-time", "Hybrid", 40).build();
        Teacher teacherMartha = new Teacher.Builder("Martha", "Sanchez", "martha123@gmail.com", "Barcelona", "Full-time", "Hybrid", 40).build();


        // enroll students
        EnrollmentService enrollmentService = new EnrollmentService();
        enrollmentService.addAllEnrollments(Arrays.asList(
                new Enrollment(studentCarlos, programming, campusValencia, teacherFrancisco),
                new Enrollment(studentCarlos, english, campusValencia, teacherMartha),
                new Enrollment(studentJessica, programming, campusBarcelona, teacherFrancisco),
                new Enrollment(studentJessica, english, campusBarcelona, teacherMartha),
                new Enrollment(studentJessica, dataAnalytics, campusBarcelona, teacherMartha)
        ));

        // Show information
        EnrollmentPresentation enrollPresentation = new EnrollmentPresentation(enrollmentService);
        enrollPresentation.showEnrollmentsByCampusLocation("Barcelona");
    }
}