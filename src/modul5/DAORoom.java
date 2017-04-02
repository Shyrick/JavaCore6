package modul5;

import java.util.Date;

public class DAORoom implements DAO{

//    Room [] bookingRoomDB = new Room[5];
//    bookingRoomDB [0] = new Room(1, 100, 2 , new Date(117, 3, 01), "Hilton", "LA");
//    Room [] bookingRoomDB = new Room[5];
//    Room room3 = new Room(3, 200, 3, new Date(117, 3, 02), "Inturist", "Minsk");
//
//     bookingRoomDB[1] = room3;

    Room room1 = new Room(1, 100, 2 , new Date(117, 3, 01), "Hilton", "LA");
    Room room2 = new Room(2, 100, 2 , new Date(117, 4, 10), "Hilton", "NY");
    Room room3 = new Room(3, 200, 3, new Date(117, 3, 02), "Inturist", "Minsk");
    Room room4 = new Room(3, 200, 3, new Date(117, 4, 03), "Marriott", "Minsk");
    Room room5 = new Room(5, 250, 1, new Date(117, 4, 18), "Hotel", "Kiev");

    Room [] bookingRoomDB =  {room1, room2, room3, room4, room5};




    Room room6 = new Room(1, 100, 2, new Date(117, 3, 01), "Motel", "Krakov");
    Room room7 = new Room(2, 150, 1, new Date(117, 3, 11), "Hilton", "Krakov");
    Room room8 = new Room(3, 200, 3, new Date(117, 3, 12), "Inturist", "Gdansk");
    Room room9 = new Room(4, 250, 4, new Date(117, 4, 03), "Marriott", "Lviv");
    Room room10 = new Room(5, 200, 2, new Date(117, 4, 18), "Hotel", "Kiev");
    Room [] googleRoomDB = {room6, room7, room8, room9, room10 };

    Room room11  = new Room(1, 100, 2 , new Date(117, 3, 01), "Motel", "Krakov");
    Room room12 = new Room(2, 200, 3 , new Date(117, 3, 11), "Hilton", "Krakov");
    Room room13 = new Room(3, 200, 3, new Date(117, 3, 12), "Inturist", "Gdansk");
    Room room14 = new Room(4, 350, 4, new Date(117, 4, 03), "Marriott", "Lviv");
    Room room15 = new Room(5, 300, 2, new Date(117, 4, 18), "Hotel", "Kiev");
    Room [] tripAdvisoRoomDB =  {room11, room12, room13, room14, room15};


    @Override
    public Room save(Room []RoomDB, Room room) {
        int flag = 0;
        for (int i = 0; i < bookingRoomDB.length; i++) {
            if (bookingRoomDB[i] == null){
                bookingRoomDB[i]=room;
               flag = 1;
               return room;
            }
        }
        if (flag == 0) {
            int length = bookingRoomDB.length+1;
            Room [] newroomsDB = new Room[length];
            for (int i = 0; i < bookingRoomDB.length ; i++) {
                newroomsDB [i]= bookingRoomDB[i];
            }
            newroomsDB[newroomsDB.length-1]=room;
            bookingRoomDB = newroomsDB;
        }

        return room;
    }

    @Override
    public boolean delete(Room []RoomDB, Room room) {
        int count = 0;
        for (int i = 0; i < bookingRoomDB.length; i++) {
            if (room.equals(bookingRoomDB[i])){
                bookingRoomDB[i]=null;
                System.arraycopy(bookingRoomDB, i+1, bookingRoomDB, i, bookingRoomDB.length-1);
                bookingRoomDB[bookingRoomDB.length-1]= null;
            }
        }
        return true;
    }

    @Override
    public Room update(Room []RoomDB, Room room) {
        for (int i = 0; i < bookingRoomDB.length-1; i++) {
            if (bookingRoomDB[i].getId() == room.getId()) {
                bookingRoomDB[i] = room;
                return room;
            }
        }
        return room;
    }

    @Override
    public Room findById(Room []RoomDB, long id) {
        for (Room room: bookingRoomDB) {
            if (room.getId()==id){
                return room;
            }
        }
        return null;
    }
}
