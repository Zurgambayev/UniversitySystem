package Main;

import Employees.User;
import Enum.Faculty;
import Enum.CourseType;
import System.Admin;
import System.UniversitySystem;
import System.Database;

import java.util.Date;
import java.util.HashMap;
import java.util.Vector;


public class Student extends User {
    private Faculty faculty;
    private Date yearOfEnrollment;
    private int gpa;
    private int semester;
//    private Vector<Course> takingCourses;
//    private HashMap<Course, Mark> marks;
//    private MenuAction[] menu;
    private HashMap<CourseType,String> sudentCourse;
//    private MenuAction[] menu = new MenuAction[] {
//            new MenuAction() { public void action() { viewMarks(); } public String actionName() { return "View Marks";}},
//            new MenuAction() { public void action() { viewCourses(); } public String actionName() { return "View Courses";}},
//            new MenuAction() { public void action() { registerForCourse(); } public String actionName() { return "Registration for course";} },
//            new MenuAction() { public void action() { viewOrganizations(); } public String actionName() { return "View Organizations";}},
//            new MenuAction() { public void action() { viewAttendance(); } public String actionName() { return "View Attendance";} },
//            new MenuAction() { public void action() { viewTranscript(); } public String actionName() { return "View Transcript";} },
//            new MenuAction() { public void action() { rateTeachers(); } public String actionName() { return "Rate Teachers";} },
//            new MenuAction() { public void action() { openLibrary(); } public String actionName() { return "Open Library";} },
//            new MenuAction() { public void action() { changePassword() ; } public String actionName() { return "Change password";} },
//            new MenuAction() { public void action() { logout(); } public String actionName() { return "Logout";} },
//
//
//    };
    public Student(int id, String login, String password, String firstName, String lastName,Faculty faculty) {
        super(id, login, password, firstName, lastName);
        this.faculty = faculty;
    }
    public void registerForCourse(){
        UniversitySystem universitySystem = new UniversitySystem();
        Database db = new Database();
        Admin admin = new Admin();
        if(admin.getRegistrationAvailable() != true){
            System.out.println(db.namedCommandLanguages.get("command4").get(UniversitySystem.languages));
        }
        int maxCredits = 21;
        System.out.println("OK, there are available courses, you can maximum have = " + maxCredits + " credits");
    }
}
