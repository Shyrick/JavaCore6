package modul3_1.Task3_4;

public class MainUser {


    public static void main(String[] args) {

        User user1 = new User("Denis", 500, 5, "Google", 200, "dolar");
        user1.paySalary();
        System.out.println(user1.salary);
        System.out.println(user1.balance);

        user1.withdraw(150);
        System.out.println(user1.balance);

        System.out.println(user1.companyNameLenght());


    }



}
