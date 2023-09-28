public class CreditPaymentService {
    public int calculate(double persent, int years, int debt) {
        int Payment;
        double mps = persent / (12 * 100);
        Payment = (int) (debt * (mps * Math.pow(mps + 1, years * 12)) / ((Math.pow(1 + mps, years * 12)) - 1));
        return Payment;
    }
}
