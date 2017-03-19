package modul4;

public class BankSystemImpl implements BankSystem {

    public void withdrawOfUser(User user, int amount){
        if (amount < user.getBank().getLimitOfWithdrawal())
        user.setBalance(user.getBalance() - amount);
        else System.out.println(user.getName() + ". Amout is exceed the limit of withdraw ");
    }
    public void fundUser(User user, int amount) {
        if (amount < user.getBank().getLimitOfFunding())
        user.setBalance(user.getBalance() + amount);
        else System.out.println(user.getName() + ". Amout is exceed the limit of funding");
    }
    public void transferMoney(User fromUser, User toUser, int amount){
       if (amount > fromUser.getBalance())
           System.out.println("Transfer rejected. " + fromUser.getName() + " has't enough money");
       else {
           fromUser.setBalance(fromUser.getBalance() - amount - fromUser.getBank().getCommission(amount));
           toUser.setBalance(toUser.getBalance() + amount);
       }
    }

    public void paySalary(User user){
        user.setBalance(user.getBalance() + user.getSalary());
    }

}
