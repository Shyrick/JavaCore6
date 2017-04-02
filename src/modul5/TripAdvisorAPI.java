package modul5;

import java.util.Date;

public class TripAdvisorAPI implements API {

    public Room [] getDB (){
        DAORoom daoRoom = new DAORoom();
        Room [] rooms = new Room [daoRoom.tripAdvisoRoomDB.length];
        rooms = daoRoom.tripAdvisoRoomDB;
        return   rooms;
    }
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        DAORoom daoRoom = new DAORoom();
        Room temproom [] = new Room[daoRoom.tripAdvisoRoomDB.length];

        int count = 0;
        for (int i = 0; i < daoRoom.tripAdvisoRoomDB.length-1; i++) {
            if (daoRoom.tripAdvisoRoomDB[i].getPrice()==price)
                if (daoRoom.tripAdvisoRoomDB[i].getPersons()==persons )
                    if (daoRoom.tripAdvisoRoomDB[i].getCityName()==city)
                        if (daoRoom.tripAdvisoRoomDB[i].getHotelName()==hotel) {
                            temproom[count] = daoRoom.tripAdvisoRoomDB[i];
                            count++;
                        }
        }
        Room foundedRooms [] = new Room[count];
        int j=0;
        for (int i = 0; i < daoRoom.tripAdvisoRoomDB.length ; i++) {
            if (temproom [i]!= null)
                foundedRooms[j]=temproom[i];
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
        else {System.out.println("В TripAdvisorAPI такая комната не найдена");
        }
    }
}
