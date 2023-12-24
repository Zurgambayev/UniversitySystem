package System;

import Employees.User;

import javax.swing.text.StyledEditorKit;
import java.util.Scanner;
import java.util.Vector;
import java.io.*;

public class Admin extends Database{
    private Boolean registrationAvailable = false;
    public void addUser(String login, String password, String firstName, String lastName){
        Vector<User> users = getUserVector();
        User user = new User(users.get(users.size()-1).getId() + 1, login, password, firstName, lastName);
        users.add(user);
    }
    public void removeUser(int id){
        Vector<User> users = getUserVector();
        boolean access = false;
        User deletingUser = null;
        for(User user: users){
            if(user.getId() == id){
                deletingUser = user;
                access = true;
            }
        }
        System.out.println(access ? users.remove(deletingUser) : "Error wrong id");
    }
    public void updateUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("If you want to update full User information \n" +
                "click to 1)\n" +
                "to update partially 2)");
        String res = scanner.next();
        Vector<User> users = getUserVector();
        User updateUser = null;
        if(res.equalsIgnoreCase("1")){
            System.out.println("User Id: ");
            int id = scanner.nextInt();

            for(User user: users){
                if(user.getId() == id){
                    updateUser = user;
                }
            }
            System.out.println("User login: without @kbtu.kz");
            String login = scanner.next() + "kbtu.kz";

            System.out.println("User password: ");
            String password = scanner.next();

            System.out.println("User firstname: ");
            String firstName = scanner.next();

            System.out.println("User lastname: ");
            String lastName = scanner.next();

            updateUser.setId(id);
            updateUser.setLogin(login);
            updateUser.setPassword(password);
            updateUser.setFirstName(firstName);
            updateUser.setLastName(lastName);
        }
    }
    public void  openRegisterCourse() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("open registration\n" +
                    "close registration ");
            try {
                String input = reader.readLine();
                if ("open registration".equals(input)) {
                    System.out.println("Registration is open.");
                    registrationAvailable = true;
                } else if ("close registration".equals(input)) {
                    System.out.println("Registration is closed.");
                    registrationAvailable =false;
                } else {
                    System.out.println("Invalid input. Please enter 'open registration' or 'close registration'.");
                }
            } catch (IOException e) {
                System.err.println("Error reading input.");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Boolean getRegistrationAvailable(){
        return registrationAvailable;
    }
}
