public class Main {
    public static void main(String[] args) {
        double BalanceonCreditCard = 5000;
        double RateofInterest = 0.17 * BalanceonCreditCard;
        double TwoMonthsInterestRate = RateofInterest * 2;
        System.out.println("The interest due after one month is "+ RateofInterest);
        System.out.println("The interest due after two months is "+ TwoMonthsInterestRate);
    }
}