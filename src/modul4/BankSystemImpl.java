package modul4;

public class BankSystemImpl implements BankSystem {

    public void withdrawOfUser(User user, int amount){
        user.setBalance(user.getBalance() - amount);
    }
    public void fundUser(User user, int amount) {
        user.setBalance(user.getBalance() + amount);
    }
    public void transferMoney(User fromUser, User toUser, int amount){
       fromUser.setBalance(fromUser.getBalance()- amount);
       toUser.setBalance(toUser.getBalance()+amount);
    }

    public void paySalary(User user){
        user.setBalance(user.getBalance() + user.getSalary());
    }

}
