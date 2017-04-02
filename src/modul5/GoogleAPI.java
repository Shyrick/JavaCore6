package modul5;

import java.util.Date;

public class GoogleAPI implements API {


    public Room [] getDB (){
        DAORoom daoRoom = new DAORoom();
        Room [] rooms = new Room [daoRoom.googleRoomDB.length];
        rooms = daoRoom.googleRoomDB;
      return   rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        DAORoom daoRoom = new DAORoom();
        Room temproom [] = new Room[daoRoom.googleRoomDB.length];

        int count = 0;
        for (int i = 0; i < daoRoom.googleRoomDB.length-1; i++) {
            if (daoRoom.googleRoomDB[i].getPrice()==price)
                if (daoRoom.googleRoomDB[i].getPersons()==persons )
                    if (daoRoom.googleRoomDB[i].getCityName()==city)
                        if (daoRoom.googleRoomDB[i].getHotelName()==hotel) {
                            temproom[count] = daoRoom.googleRoomDB[i];
                            count++;
                        }
        }
        Room foundedRooms [] = new Room[count];
        int j=0;
        for (int i = 0; i < daoRoom.googleRoomDB.length ; i++) {
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
        else {System.out.println("В GoogleAPI такая комната не найдена");
        }
    }
}
