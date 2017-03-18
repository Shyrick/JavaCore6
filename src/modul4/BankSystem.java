package modul4;

public interface BankSystem {

    void withdrawOfUser(User user, int amount);
    void fundUser(User user, int amount);
    void paySalary(User user);
    void transferMoney(User fromUser, User toUser, int amount);
}
