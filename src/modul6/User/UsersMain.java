package modul6.User;

public class UsersMain {

    public static void showArray (long [] users){
        for (long user : users) {
            System.out.println(user);
        }
        System.out.println("==================");
    }
    public static void showArray (User [] users){
        for (User user : users) {
            System.out.println(user);
        }
        System.out.println("==================");
    }

    public static void main(String[] args) {

    User user1 = new User(0001L, "Name1", "LastName1", 100, 1000);
    User user2 = new User(0001L, "Name1", "LastName1", 100, 1000);
    User user3 = new User(0003L, "Name3", "LastName3", 300, 1600);
    User user4 = new User(0004L, "Name4", "LastName4", 400, 1000);

    User [] users = {user1, user2, null, user3, user4, null, };

    UserUtils userUtils = new UserUtils();


        showArray(userUtils.paySalaryToUsers(users));

        showArray( userUtils.uniqueUsers(users));
        showArray(userUtils.getUsersId(users));
        showArray(userUtils.deleteEmptyUsers(users));
    }

}
