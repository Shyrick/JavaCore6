package modul6;

public class UserUtils {

   public User[] uniqueUsers(User[] users) {

       int count = 0;
       int index = 0;

       for (int i = 0; i < users.length; i++) {
           int flag = 0;
           if (users[i] != null) {

               for (int j = 0; j < users.length; j++) {
                   if (j == i) continue;
                   if (users[j] != null && users[i].equals(users[j])) {
                       flag = 1;
                   }
               }
               if (flag == 0) {
                   count++;
               }
           }
       }
       User[] uniqueUsersArray = new User[count];

       for (int i = 0; i < users.length; i++) {
           int flag = 0;
           if (users[i] != null) {

               for (int j = 0; j < users.length; j++) {
                   if (j == i) continue;
                   if (users[j] != null && users[i].equals(users[j])) {
                       flag = 1;
                   }
               }
               if (flag == 0) {
                   uniqueUsersArray[index] = users[i];
                   index++;
               }
           }
       }
       return uniqueUsersArray;
   }
   public User[] usersWithContitionalBalance (User[]users,int balance){

           int count = 0;
           for (User user : users) {
               if (user != null) {
                   if (user.getBalance() == balance) {
                       count++;
                   }
               }

           }

           User[] newArray = new User[count];

           int index = 0;
           for (User user : users) {

                if (user != null) {
                    if (user.getBalance() == balance) {
                        newArray[index] = user;
                        index++;
                    }
                }
           }


           return newArray;
   }

   public final User[]  paySalaryToUsers(User[] users){

        for (int i = 0; i <users.length; i++) {
            if (users[i] != null) {
                users[i] = new User(users[i].getId(), users[i].getFirstName(), users[i].getLastName(), users[i].getSalary(), users[i].getBalance() + users[i].getSalary());
            }
        }
        return users;
   }


   public final long[] getUsersId(User[] users){

        long[] usersIdArray = new long[users.length];
        for (int i = 0; i < users.length; i++) {

            if (users[i] != null) {
                usersIdArray[i] = users[i].getId();
            }
        }
        return usersIdArray;
   }

   public User[] deleteEmptyUsers(User[] users){

        int count = 0;
        for (User user : users) {

            if (user != null){
                count++;
            }
        }
        User [] usersArray = new User[count];

        int index = 0;
        for (User user : users) {

            if (user != null){
                usersArray[index] = user;
                index++;
            }
        }
        return usersArray;
   }


}
