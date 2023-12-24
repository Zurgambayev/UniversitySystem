package Main;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import Enum.Languages;
public class News {
    private LocalDate dayAndTime;
    private Map<String, Map<Languages, String>> titleNews;
    public News(LocalDate dayAndTime,Map<String, Map<Languages, String>> titleNews){

        this.dayAndTime = dayAndTime;
        this.titleNews = new HashMap<>(titleNews); 

    }

    public LocalDate getDate() {
        return dayAndTime;
    }

    @Override
    public String toString() {
        return "Main.News{" +
                ", dayAndTime=" + dayAndTime +
                '}';
    }
}
