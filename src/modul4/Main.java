package modul4;

public class Main {

    public static void main(String[] args) {

        USBank USBANK = new USBank(1101L, "USA", Currency.USD, 10, 800, 1, 1000000);
        EUBank EUBANK = new EUBank(1102L, "Danmark", Currency.EUR, 20, 900, 2, 2000000);
        ChinaBank CHINABANK = new ChinaBank(1103L, "China", Currency.EUR, 30, 1000, 3, 3000000);

        User user1 = new User(0001, "Ivan", 1000, 1, "Google", 200, USBANK );
        User user2 = new User(0002, "Den", 1000, 2, "Apple", 300, USBANK );
        User user3 = new User(0003, "Anna", 1000, 3, "Merycay", 400, EUBANK );
        User user4 = new User(0004, "Peter", 1000, 4, "Yandex", 500, EUBANK);
        User user5 = new User(0005, "Jane", 1000, 5, "Facebook", 600, CHINABANK );
        User user6 = new User(0006, "Kate", 1000, 6, "VK", 700, CHINABANK );
    }
}
