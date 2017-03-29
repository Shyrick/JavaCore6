package modul5;

import java.util.Date;

public class BookingComAPI implements API {


    Room [] rooms = new Room [5];

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


        public void showFoundedRooms (Room room []){
            if (room.length != 0) {
                for (Room rrr : room) {
                    System.out.println(rrr);
                }
            }
            else {System.out.println("В BookingComAPI такая комната не найдена");
            }
        }
}
