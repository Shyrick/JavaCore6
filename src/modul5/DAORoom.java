package modul5;

import java.util.Date;

public class DAORoom implements DAO{


    BookingComAPI bookingDAO = new BookingComAPI();

    Room room1 = new Room(1, 100, 2 , new Date(117, 3, 01), "Hilton", "LA");
    Room room2 = new Room(2, 100, 2 , new Date(117, 4, 10), "Hilton", "NY");
    Room room3 = new Room(3, 200, 3, new Date(117, 3, 02), "Inturist", "Minsk");
    Room room4 = new Room(3, 200, 3, new Date(117, 4, 03), "Marriott", "Minsk");
    Room room5 = new Room(5, 250, 1, new Date(117, 4, 18), "Hotel", "Kiev");
//    Room room1 = new Room(1, 100, 2, new Date(117, 3, 01), "Motel", "Krakov");
//    Room room2 = new Room(2, 150, 1, new Date(117, 3, 11), "Hilton", "Krakov");
//    Room room3 = new Room(3, 200, 3, new Date(117, 3, 12), "Inturist", "Gdansk");
//    Room room4 = new Room(4, 250, 4, new Date(117, 4, 03), "Marriott", "Lviv");
//    Room room5 = new Room(5, 200, 2, new Date(117, 4, 18), "Hotel", "Kiev");
//    Room room1  = new Room(1, 100, 2 , new Date(117, 3, 01), "Motel", "Krakov");
//    Room room2 = new Room(2, 200, 3 , new Date(117, 3, 11), "Hilton", "Krakov");
//    Room room3 = new Room(3, 200, 3, new Date(117, 3, 12), "Inturist", "Gdansk");
//    Room room4 = new Room(4, 350, 4, new Date(117, 4, 03), "Marriott", "Lviv");
//    Room room5 = new Room(5, 300, 2, new Date(117, 4, 18), "Hotel", "Kiev");

    Room [] roomsDB= new Room [] {room1, room2, room3, room4, room5};

    @Override
    public Room save(Room room) {
        int flag = 0;
        for (int i = 0; i < roomsDB.length; i++) {
            if (roomsDB[i] == null){
                roomsDB[i]=room;
               flag = 1;
               return room;
            }
        }
        if (flag == 0) {
            int length = roomsDB.length+1;
            Room [] newroomsDB = new Room[length];
            for (int i = 0; i <roomsDB.length ; i++) {
                newroomsDB [i]=roomsDB[i];
            }
            newroomsDB[newroomsDB.length-1]=room;
            roomsDB = newroomsDB;
        }

        return room;
    }

    @Override
    public boolean delete(Room room) {
        int count = 0;
        for (int i = 0; i < roomsDB.length; i++) {
            if (room.equals(roomsDB[i])){
                roomsDB[i]=null;
                System.arraycopy(roomsDB, i+1, roomsDB, i,roomsDB.length-1);
                roomsDB[roomsDB.length-1]= null;
            }
        }
        return true;
    }

    @Override
    public Room update(Room room) {
        for (int i = 0; i < roomsDB.length-1; i++) {
            if (roomsDB[i].getId() == room.getId()) {
                roomsDB[i] = room;
                return room;
            }
        }
        return room;
    }

    @Override
    public Room findById(long id) {
        for (Room room:roomsDB) {
            if (room.getId()==id){
                return room;
            }
        }
        return null;
    }
}
