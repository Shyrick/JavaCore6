package modul7;

public class Order {

    private long id;
    private int price;
    private Currency currency;
    private String itemName;
    private String shopIdentificator;
    private User user;

    private enum  Currency{
        USD, EUR
    }
}
