package modul5;

public class Mainroom {

    public static void main(String[] args) {

        BookingComAPI a  = new BookingComAPI();

        a.showFoundedRooms(a.findRooms( 100, 3 , "LA", "Hilton"));


    }

}
