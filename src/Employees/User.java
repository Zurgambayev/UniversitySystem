package Employees;
import Enum.Languages;
import System.UniversitySystem;
import System.Database;
import Main.News;


import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Vector;
import java.io.*;

public class User implements Serializable {
    private int id;
    private String login;
    private String password;
    private String firstName;
    private String lastName;

    public User(){

    }

    public User(int id, String login, String password, String firstName, String lastName) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }
//    public static void login() throws IOException {
//        Database db = new Database();
//        UniversitySystem universitySystem = new UniversitySystem();
//        System.out.println("Hello, type your login and password");
//        int tries = 6;
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        while(true) {
//            if(tries == 0) System.out.println("Goodbye nedo haker or slowpoke");
//            String login = bufferedReader.readLine();
//            String password =  bufferedReader.readLine();
//            if(!password.equals(null) &&password.equals(db.passwordByLogin.get(login))) {
////                UniSystem.currentUser =  UniSystem.db.userByLogin.get(login);
//                break;
//            }
////			else if(UniSystem.db.passwordByLogin.get(login).equals(null)) {
////				System.out.println("There is no such login");
////			}
//            else System.out.println("Please, check your login or password");
//            tries--;
//            System.out.println("You have " + tries + " tries");
//        }
////        viewNews();
//    }

public void login() throws IOException {
    System.out.println("Hello, type your login and password");
    int tries = 6;
    Database db = new Database();
    UniversitySystem universitySystem = new UniversitySystem();
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
        String login = "";

        System.out.print(db.namedCommandLanguages.get("command1").get(UniversitySystem.languages) + ":");
        login = bufferedReader.readLine();

        System.out.print(db.namedCommandLanguages.get("command2").get(UniversitySystem.languages) + ":");
        String password = bufferedReader.readLine();

        if (!password.equals(null) && password.equals(db.passwordByLogin.get(login))) {
            break;
        } else {
            tries--;
            if (tries == 0) {
                System.out.println("error");
                return;
            } else {
                System.out.println(db.namedCommandLanguages.get("command3").get(UniversitySystem.languages));
            }
        }
    }
}

public void viewNews(){

}

    public void logout(){
//        TODO:
    }

//    public void viewNews(){
//        Main.News news = new Main.News();
//        news.getNews();
//    }

    public void changePassword(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напиши свой новый пароль: ");
        String password = scanner.next();
        setPassword(password);
        System.out.println("Успешно обновили пароль для wsp");
    }

    public void updateLogin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напиши свой новый логин: ");
        String login = scanner.next();
        setLogin(login);
        System.out.println("Успешно обновили логин для wsp");
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//    public Languages getLanguages() {
//        return languages;
//    }

//    public void setLanguages(Languages languages) {
//        this.languages = languages;
//    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
//                ", languages=" + languages +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
////        return id == user.id && Objects.equals(login, user.login) && Objects.equals(password, user.password) && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && languages == user.languages;
//    }


//    public int hashCode() {
//        return Objects.hash(id, login, password, firstName, lastName, languages);
//    }
}
