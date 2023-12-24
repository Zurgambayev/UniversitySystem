package View;
import Enum.Languages;
import java.util.HashMap;
import java.util.Map;
public class ViewStart {
    public  HashMap<Integer, Languages> languagesHashMap = new HashMap<Integer, Languages>() {{
        put(1, Languages.KZ);
        put(2, Languages.ENG);
        put(3, Languages.RUS);
    }};

    public void showMenu(){
        System.out.println("Choose languages");
        for (Integer key : languagesHashMap.keySet()) {
            System.out.println(key + ". " + languagesHashMap.get(key));
        }
//        System.out.println("Zein=====Dnyil====Welkom to DAZA====Aray=====Alan");
//        System.out.println("Menu: choose your option");
//        System.out.println("1. Login");
//        System.out.println("2. Exit");
    }
}
