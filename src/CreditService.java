public class CreditService {
     public double calculate(double sum, int period, double rate) {
        double mRate = rate / 100 / period; // ежемесячная процентная ставка
        double pow = Math.pow(1 + mRate, period);
        double creditPayment =  sum*(mRate+(mRate /(pow -1))); // сумма погашения (основная сумма + проценты)
        return creditPayment;
    }
}

