package Main;

import java.time.LocalDate;
import java.util.Vector;



import Enum.Faculty;
import Enum.CourseType;

public class Course {
    //    private int id;
    private String nameOfCourse;
    private Vector<Student> students;
    private int numOfCredits;
    private Vector<Course> prerequisits;
    private Faculty faculty;
    private String cipher; // добавить в UML
    private CourseType courseType;
    private long months;

    public Course(String nameOfCourse,int numOfCredits, String cipher,Faculty faculty,long months){
        this.nameOfCourse = nameOfCourse;
        this.numOfCredits = numOfCredits;
        this.cipher =  cipher;
        this.faculty = faculty;
        this.months = months;
    }
}
