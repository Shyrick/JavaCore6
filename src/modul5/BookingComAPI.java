package modul5;

public class BookingComAPI implements API {

    public Room [] getDB (){
        DAORoom daoRoom = new DAORoom();
        Room [] rooms = new Room [daoRoom.bookingRoomDB.length];
        rooms = daoRoom.bookingRoomDB;
        return   rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        DAORoom daoRoom = new DAORoom();
        Room temproom [] = new Room[daoRoom.bookingRoomDB.length];

        int count = 0;
        for (int i = 0; i < daoRoom.bookingRoomDB.length-1; i++) {
            if (daoRoom.bookingRoomDB[i].getPrice()==price)
                if (daoRoom.bookingRoomDB[i].getPersons()==persons )
                    if (daoRoom.bookingRoomDB[i].getCityName()==city)
                        if (daoRoom.bookingRoomDB[i].getHotelName()==hotel) {
                            temproom[count] = daoRoom.bookingRoomDB[i];
                            count++;
                        }
        }
        Room foundedRooms [] = new Room[count];
        int j=0;
        for (int i = 0; i < daoRoom.bookingRoomDB.length ; i++) {
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
            else {System.out.println("В BookingComAPI такая комната не найдена");
            }
        }
}
