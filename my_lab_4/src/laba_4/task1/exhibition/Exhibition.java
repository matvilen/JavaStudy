package laba_4.task1.exhibition;

import java.sql.Time;
import java.time.Year;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Exhibition {
    String name_of_exhipition;
    Date date;
    Time time;
    ArrayList<Picture> pictures;

    public Exhibition(){
    }

    public Exhibition(String name, Date date){
        this.name_of_exhipition = name;
        pictures = new ArrayList<Picture>();
    }
    public void addPicture(String name, String author, Year year){
        pictures.add(new Picture(name, author, year));
    }

    @Override
    public String toString() {
        return "Exhibition \n{" +
                "name: '" + name_of_exhipition + '\'' +
                "\npictures: \n" + pictures +
                '}';
    }

    class Picture{
        String p_name;
        String p_author;
        Year p_year;

        public Picture(){
        }
        public Picture(String name, String author, Year year){
            p_name = name;
            p_author = author;
            p_year = year;

        }
    }
}
