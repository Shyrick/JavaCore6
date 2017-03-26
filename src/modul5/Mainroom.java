package modul5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Mainroom {

    public static void main(String[] args) {

        APIRoom1 a  = new APIRoom1();

        a.showFoundedRooms(a.findRooms( 100, 3 , "LA", "Hilton"));


    }

}
