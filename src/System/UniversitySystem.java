package System;

import Enum.Languages;
import View.ViewStart;
import Employees.User;

import java.io.*;

public class UniversitySystem {
    ViewStart viewStart = new ViewStart() ;

    public static Languages languages;
    public void launch() throws IOException {
        viewStart.showMenu();
        User user = new User();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int chooseINT = Integer.parseInt(bufferedReader.readLine());
        if (viewStart.languagesHashMap.containsKey(chooseINT)) {
            languages = viewStart.languagesHashMap.get(chooseINT);
              System.out.println(languages);
        }else{
                System.out.println("Сіз қате нөмір енгіздіңіз, қайта енгізіңіз");
                System.out.println("you entered the wrong number, enter it again");
                System.out.println("вы ввели не правильную цифру , введите еще раз");
                launch();
        }
        user.login();
    }
}

