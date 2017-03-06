package modul4;

public class ChinaBank extends Bank {

    public ChinaBank(Long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limitOfWithdrawal;
        if (getCurrency()==Currency.USD)
            limitOfWithdrawal = 100;
        else limitOfWithdrawal = 150;
        return limitOfWithdrawal;
    }

    @Override
    int getLimitOfFunding() {
        int limitOfFunding;
        if (getCurrency()==Currency.EUR)
            limitOfFunding = 5000;
        else limitOfFunding = 10000;
        return limitOfFunding;
    }

    @Override
    int getMonthlyRate() {
        int monthlyRate;
        if (getCurrency()==Currency.USD)
            monthlyRate = (int) 0.01;
        else monthlyRate = 0;
        return monthlyRate;
    }

    @Override
    int getCommission(int summ) {
        int commission;
        if (getCurrency()==Currency.USD && summ < 1000) commission = (int) 0.03;
        if (getCurrency()==Currency.USD && summ > 1000) commission = (int) 0.05;
        if (getCurrency()==Currency.EUR && summ < 1000) commission = (int) 0.10;
        else commission = (int) 0.11;
        return commission;
    }
}
