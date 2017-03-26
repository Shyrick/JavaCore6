package modul5;

import java.util.Date;

public class TripAdvisorAPI implements API {

    Room room1  = new Room(1, 100, 2 , new Date(117, 3, 01), "Motel", "Krakov");
    Room room2 = new Room(2, 200, 3 , new Date(117, 3, 11), "Hilton", "Krakov");
    Room room3 = new Room(3, 200, 3, new Date(117, 3, 12), "Inturist", "Gdansk");
    Room room4 = new Room(4, 350, 4, new Date(117, 4, 03), "Marriott", "Lviv");
    Room room5 = new Room(5, 300, 2, new Date(117, 4, 18), "Hotel", "Kiev");

    Room rooms[] = new Room [] {room1, room2, room3, room4, room5};

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room room [] = new Room[rooms.length];
        int count = 0;
        for (int i = 0; i < rooms.length-1; i++) {
            if (rooms[i].getPrice()==price)
                if (rooms[i].getPersons()==persons )
                    if (rooms[i].getCityName()==city)
                        if (rooms[i].getHotelName()==hotel) {
                            room[count] = rooms[i];
                            count++;
                        }
        }

        Room foundedRooms [] = new Room[count];
        int j=0;
        for (int i = 0; i < rooms.length-1 ; i++) {
            if (room [i]!= null)
                foundedRooms[j]=room[i];
            j++;
        }
        return  foundedRooms;
    }
}
