package modul5;

public class Controller {


    API apis[] = new API [] {new BookingComAPI(), new GoogleAPI(),new TripAdvisorAPI()};


    Room[] requstRooms(int price, int persons, String city, String hotel) {

        int count1 = 0;

        for (int i = 0; i < apis.length; i++) {
            int tempCount = apis[i].findRooms(price, persons, city, hotel).length;
            count1 += tempCount;
        }
        Room[] requstRoomsArray = new Room[count1];
        Room[] tempArray = new Room[count1];
        int sumcount = 0;
        for (int i = 0; i < apis.length; i++) {
            tempArray = apis[i].findRooms(price, persons, city, hotel);
            int count2 = tempArray.length;
            sumcount += count2;

            int k = 0;
            for (int j =(sumcount-count2); j < sumcount; j++ ){

                requstRoomsArray [j] = tempArray[k];
                k++;
            }
        }
        return requstRoomsArray;
    }



    Room[] check(API api1, API api2){

        Room [] api1Rooms = new Room[api1.getDB().length];
        api1Rooms = api1.getDB();
        Room [] api2Rooms = new Room[api2.getDB().length];
        api2Rooms = api2.getDB();

        int count = 0;
        for (int i = 0; i <api1.getDB().length ; i++) {
            for (int j = 0; j <api2.getDB().length ; j++) {
                if (api1Rooms[i].equals(api2Rooms[j])){
                    count++;
                }
            }
        }
        Room [] checkedRooms = new Room[count];
        int k = 0;
        for (int i = 0; i <api1.getDB().length ; i++) {
            for (int j = 0; j <api2.getDB().length ; j++) {
                if (api1Rooms[i].equals(api2Rooms[j])){
                    checkedRooms[k] = api1Rooms[i];
                    k++;
                }
            }
        }
        return checkedRooms;
    }
}
