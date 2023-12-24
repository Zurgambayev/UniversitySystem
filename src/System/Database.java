package System;

import Employees.User;
import Main.Student;
//import Main.Course;
import Enum.Faculty;
import Enum.Languages;
import Main.News;

import java.io.Serializable;
import java.util.*;
import java.util.Map;
import java.util.Date;
import java.util.Vector;
import java.time.LocalDate;

public class Database implements Serializable {
    public Map<String, String> passwordByLogin = new HashMap<>(
            Map.of(
                    "z_zurgambaev@kbtu.kz","zein2004"
            )
    );

    Vector<User> userVector = new Vector<>(
            List.of(
                    new User(30505, "a_abzalkhanuly@kbtu.kz", "12341234", "Alan", "Abzalkhanuly"),
                    new User(30506, "z_zurgambaev@kbtu.kz", "11112222", "Zeinaddin", "Zurgambaev")
            )
    );
    Vector<Student> students = new Vector<>(
            List.of(
                    new Student(1,"z_zurgambaev", "zein11", "Zeinaddin", "Zurgambaev", Faculty.FIT),
                    new Student(2, "a_abzalkhanuly@kbtu.kz","alanKachok11", "Alan", "Abzalkhanuly",Faculty.FIT)
            )
    );

//    Vector<Course> universityCourses = new Vector<>(
//            List.of(
//                    new Course("Computer Science", 4, "CS101"),
//                    new Course("Mathematics", 3, "MATH201"),
//                    new Course("Physics", 4, "PHY301"),
//                    new Course("History", 3, "HIST101"),
//                    new Course("Chemistry", 4, "CHEM201" ),
//                    new Course("OOP", 6, "CSCI2106"),
//                    new Course("Economics", 4, "ECON101"),
//                    new Course("Psychology", 3, "PSYCH201"),
//                    new Course("ADS", 6, "CSCI2105"),
//                    new Course("PP1", 3, "POLSCI101")
//            )
//    );
public Map<String, Map<Languages, String>> namedCommandLanguages = new HashMap<>(
            Map.of(
                    "command1", Map.of(
                            Languages.KZ, "Логин енгізіңіз",
                            Languages.ENG, "login",
                            Languages.RUS, "Введите имя пользователя"
                    ),
                    "command2" , Map.of(
                            Languages.KZ, "Құпия сөзенгізіңіз",
                            Languages.ENG, "passwords",
                            Languages.RUS, "Введите пороль"
                    ),
                    "command3" , Map.of(
                            Languages.KZ, "Логин немесе құпия сөзді қате енгіздіңіз",
                            Languages.ENG, "You have entered an invalid login or password",
                            Languages.RUS, "Вы ввели неправльный логин или пороль"
                    ),
                    "command4", Map.of(
                            Languages.KZ, "Тіркеу әлі ашылған жоқ",
                            Languages.ENG, "Registration is not open yet",
                            Languages.RUS, "Регистрация еще не открыта"
                    ),
                    "command5",Map.of(
                            Languages.KZ, "қол жетімді курстар бар, сіз максималды ала аласыз",
                            Languages.ENG, "OK, there are available courses, you can maximum have",
                            Languages.RUS, "Хорошо, есть доступные курсы, вы можете получить максимум"
                    )
            )
);
    public Map<String, Map<Languages, String>> nameNewsLanguages = new HashMap<>(

            Map.of(
                    "News1", Map.of(
                            Languages.KZ, "Зейнаддин Зурғамбаев есімді екінші курс студенті дүние жүзіндегі данышпандарды іздеген республикалық олимпиаданың жеңімпазы атанып, Илон Масктан ақша алды.",
                            Languages.ENG, "A 2nd year student named Zeynaddin Zurgambayev won the Republican Olympiad to find geniuses around the world and won the state of Ilon Max.",
                            Languages.RUS, "Студент второго курса по имени Зейнаддин Зургамбаев стал победителем в республиканской олимпиаде по нахождению гениев во всем мире и получил состояние от Илона Маска."
                    ),
                    "News1_title", Map.of(
                            Languages.KZ, "Мақтанышымыз",
                            Languages.ENG, "Our pride",
                            Languages.RUS, "Наша гордость"
                    )
            )

    );


        Vector<News> news = new Vector<>(

                List.of(
                        new News(LocalDate.of(2023, 12, 12),nameNewsLanguages)
                )
        );


    public Vector<User> getUserVector() {
        return userVector;
    }

    public void setUserVector(Vector<User> userVector) {
        this.userVector = userVector;
    }
}