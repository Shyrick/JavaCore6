package modul5;

import java.util.Date;

public class APIRoom1 implements API {

    Room room1 = new Room(1, 100, 2 , new Date(117, 3, 01), "Hilton", "LA");
    Room room2 = new Room(2, 100, 2 , new Date(117, 4, 10), "Hilton", "NY");
    Room room3 = new Room(3, 200, 3, new Date(117, 3, 02), "Inturist", "Minsk");
    Room room4 = new Room(4, 200, 3, new Date(117, 4, 03), "Marriott", "Minsk");
    Room room5 = new Room(5, 250, 1, new Date(117, 4, 18), "Hotel", "Kiev");

    Room roomsarray [] = new Room [] {room1, room2, room3, room4, room5};

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
            Room rooms [] = new Room[roomsarray.length];
            int count = 0;
        for (int i = 0; i < roomsarray.length-1; i++) {
            if (roomsarray[i].getPrice()==price)
                if (roomsarray[i].getPersons()==persons )
                    if (roomsarray[i].getCityName()==city)
                        if (roomsarray[i].getHotelName()==hotel) {
                            rooms[count] = roomsarray[i];
                            count++;
                        }
        }

        Room foundedRooms [] = new Room[count];
        int j=0;
        for (int i = 0; i <roomsarray.length-1 ; i++) {
            if (rooms [i]!= null)
                foundedRooms[j]=rooms[i];
                    j++;
        }
        return  foundedRooms;
    }


        public void showFoundedRooms (Room room []){
            if (room.length != 0) {
                for (Room rrr : room) {
                    System.out.println(rrr);
                }
            }
            else {System.out.println("Такая комната не найдена");}
        }
}
