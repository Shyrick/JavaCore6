package modul4;

public class EUBank extends Bank {

    public EUBank(Long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limitOfWithdrawal;
        if (getCurrency()==Currency.USD)
            limitOfWithdrawal = 2000;
        else limitOfWithdrawal = 2200;
        return limitOfWithdrawal;
    }

    @Override
    int getLimitOfFunding() {
        int limitOfFunding;
        if (getCurrency()==Currency.EUR)
            limitOfFunding = 2000;
        else limitOfFunding = 1000;
        return limitOfFunding;
    }

    @Override
    int getMonthlyRate() {
        int monthlyRate;
        if (getCurrency()==Currency.USD)
            monthlyRate = 0;
        else monthlyRate = (int)0.01;
        return monthlyRate;
    }

    @Override
    int getCommission(int summ) {
        int commission;
        if (getCurrency()==Currency.USD && summ < 1000) commission = (int) 0.05;
            if (getCurrency()==Currency.USD && summ > 1000) commission = (int) 0.07;
              if (getCurrency()==Currency.EUR && summ < 1000) commission = (int) 0.02;
                   else commission = (int) 0.04;
        return commission;
    }
}
