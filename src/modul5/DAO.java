package modul5;

import java.util.Date;

public interface DAO {



    public Room save(Room []RoomDB, Room room);
    boolean delete(Room []RoomDB, Room room);
    Room update(Room []RoomDB, Room room);
    Room findById(Room []RoomDB, long id);
}
