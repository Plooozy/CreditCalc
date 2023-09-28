public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double persent = 9.99;
        int debt = 1_000_000;
        int Payment = service.calculate(persent, 1, debt);
        System.out.println("Ежемесячный платёж при взятии кредита на 1 год " + Payment);
        System.out.println();
        int Payment2 = service.calculate(persent, 2, debt);
        System.out.println("Ежемесячный платёж при взятии кредита на 2 года " + Payment2);
        System.out.println();
        int Payment3 = service.calculate(persent, 3, debt);
        System.out.println("Ежемесячный платёж при взятии кредита на 3 года " + Payment3);
    }
}