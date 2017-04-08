package modul5;

import java.util.Date;

public class Mainroom {

    public static void showRooms (Room []room){
        if (room.length != 0) {
            for (Room rrr : room) {
                System.out.println(rrr);
            }
        }
        else {System.out.println("Такая комната не найдена");
        }
    }

    public static void main(String[] args) {

      BookingComAPI bookingComAPI  = new BookingComAPI();
      DAORoom daoRoom = new DAORoom();
      GoogleAPI googleAPI = new GoogleAPI();

      Controller controller = new Controller();



//        showRooms(controller.requstRooms(300, 2 , "LA", "Hilton"));
//        showRooms(controller.requstRooms(150, 1 , "Krakov", "Hilton"));
//
//        showRooms(controller.check(new BookingComAPI(), new GoogleAPI()));
//        showRooms(controller.check(new TripAdvisorAPI(), new GoogleAPI()));
//
//        showRooms(bookingComAPI.findRooms(300, 2 , "LA", "Hilton"));
//        showRooms(bookingComAPI.findRooms(150, 1 , "Krakov", "Hilton"));
//        showRooms(bookingComAPI.findRooms(  100, 2 , "Krakov", "Hilton"));
//
//          daoRoom.findById(daoRoom.bookingRoomDB, 15);
//          daoRoom.update(daoRoom.bookingRoomDB, new Room(15, 200, 2, new Date(117, 4, 18), "Hilton", "Kiev"));
//          showRooms(daoRoom.bookingRoomDB);
//
//            daoRoom.delete(daoRoom.bookingRoomDB, new Room(15, 250, 1, new Date(117, 4, 18), "Hotel", "Kiev"));
//        daoRoom.delete(daoRoom.bookingRoomDB, new Room(13, 200, 3, new Date(117, 3, 02), "Inturist", "Minsk"));
//        showRooms(daoRoom.bookingRoomDB);
//
//        daoRoom.delete(daoRoom.bookingRoomDB, new Room(15, 250, 1, new Date(117, 4, 18), "Hotel", "Kiev"));
//        showRooms(daoRoom.bookingRoomDB);

        daoRoom.save(daoRoom.bookingRoomDB,new Room(25, 200, 2, new Date(117, 4, 18), "Hotel", "Kiev") );
        showRooms(daoRoom.bookingRoomDB);
    }


}
