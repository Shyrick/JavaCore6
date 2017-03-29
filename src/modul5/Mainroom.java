package modul5;

public class Mainroom {

    public static void main(String[] args) {

        BookingComAPI bookingComAPI  = new BookingComAPI();
        GoogleAPI googleAPI = new GoogleAPI();

        bookingComAPI.showFoundedRooms(bookingComAPI.findRooms( 100, 3 , "LA", "Hilton"));
        googleAPI.showFoundedRooms(googleAPI.findRooms(100, 3 , "LA", "Hilton"));



    }

}
