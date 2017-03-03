package modul3_1.Task3_4;

public class User {

    String name;
    double balance;
    int monthsOfEmployment;
    String companyName;
    double salary;
    String currency;

    void paySalary(){
        balance += salary;
    }

     void withdraw (double summ) {
        if (summ < 1000) {
            balance = balance - 1.05 * summ;
        }
        else {
            balance = balance - 1.1 * summ;
        }
    }

    int companyNameLenght (){
         int i = getCompanyName().length();
         return i;
    }

    int monthIncreaser(int addMonth){
        monthsOfEmployment += addMonth;
        return monthsOfEmployment;
    }

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getSalary() {
        return salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
