package Main;

import System.SerializableDes;
import View.ViewStart;
import System.UniversitySystem;
import System.Database;
import Enum.Speciality;
import Enum.CourseType;
import System.KeyValuePair;

import java.io.IOException;
import java.util.List;
import java.util.Map;
public class Main {
    public static void main(String[] args) throws IOException {

        SerializableDes serializableDes = new SerializableDes();
        // запуск меню т выбор языка
        UniversitySystem us = new UniversitySystem();


//        Database db = new Database();
//        for (Map.Entry<Speciality, List<KeyValuePair<CourseType, Course>>> entry : db.courses.entrySet()) {
//            Speciality speciality = entry.getKey();
//            List<KeyValuePair<CourseType, Course>> coursesList = entry.getValue();
//
//            System.out.println("Speciality: " + speciality);
//            for (KeyValuePair<CourseType, Course> courseEntry : coursesList) {
//                CourseType courseType = courseEntry.getKey();
//                Course course = courseEntry.getValue();
//
//                System.out.println("  CourseType: " + courseType);
//                System.out.println("  Course: " + course.nameOfCourse);
//            }
//            System.out.println();
//        }
        us.launch();
    }
}
