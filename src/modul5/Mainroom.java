package modul5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Mainroom {

    public static void main(String[] args) {

        Date date1 = new Date(117, 3, 01);
        Date date2 = new Date(117, 4, 10);
        Date date3 = new Date(117, 3, 18);
        Date date4 = new Date(117, 4, 11);
        Date date5 = new Date(117, 3, 12);

        Room room1 = new Room(1, 100, 2 , date1, "Hilton", "LA");
        Room room2 = new Room(2, 100, 2 , date2, "Hilton", "NY");
        Room room3 = new Room(3, 200, 3, date3, "Inturist", "Minsk");
        Room room4 = new Room(4, 200, 3, date4, "Marriott", "Minsk");
        Room room5 = new Room(5, 250, 1, date5, "Hotel", "Kiev");

       System.out.println(date1);
    }

}
