package modul4;

public class USBank extends Bank{

    public USBank(Long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limitOfWithdrawal;
        if (getCurrency()==Currency.USD)
            limitOfWithdrawal = 1000;
        else limitOfWithdrawal = 1200;
        return limitOfWithdrawal;
    }

    @Override
    int getLimitOfFunding() {
        int limitOfFunding;
        if (getCurrency()==Currency.EUR)
            limitOfFunding = 10000;
        else limitOfFunding = Integer.MAX_VALUE;
        return limitOfFunding;
    }

    @Override
    int getMonthlyRate() {
        int monthlyRate;
        if (getCurrency()==Currency.USD)
            monthlyRate = (int) 0.01;
        else monthlyRate = (int)0.02;
        return monthlyRate;
    }

    @Override
    int getCommission(int summ) {
        int commission;
        if (getCurrency()==Currency.USD && summ < 1000) commission = (int) 0.05;
            if (getCurrency()==Currency.USD && summ > 1000) commission = (int) 0.07;
                if (getCurrency()==Currency.EUR && summ < 1000) commission = (int) 0.06;
                    else commission = (int) 0.08;
        return commission;
    }

}
