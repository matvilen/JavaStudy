package laba_4.task1.exhibition;

import java.time.Year;
import java.util.Date;

//4.	Создать класс Художественная Выставка с внутренним классом,
// с помощью объектов которого можно хранить информацию о картинах,
// авторах и времени проведения выставок.
public class MainExhibition {
    public static void main(String[] args) {

        Date date = new Date(1212121212121L);

        Exhibition exhibition1 = new Exhibition("Aivazovsky", date);

        exhibition1.addPicture("Sea1","Aivazovsky_Exib", Year.of(1856));
        exhibition1.addPicture("Sea2","Aivazovsky", Year.of(1856));
        exhibition1.addPicture("Sea3","Aivazovsky", Year.of(1856));
        exhibition1.addPicture("Sea4","Aivazovsky", Year.of(1856));

        Exhibition exhibition2 = new Exhibition("VanGog_Exib", date);
        exhibition2.addPicture("Pict_1","VanGog", Year.of(1856));
        exhibition2.addPicture("Pict_2","Aivazovsky", Year.of(1856));
        exhibition2.addPicture("Pict_3","Aivazovsky", Year.of(1856));
        exhibition2.addPicture("Pict_4","Aivazovsky", Year.of(1856));

        System.out.println(exhibition1);
        System.out.println(exhibition2);


    }

}
