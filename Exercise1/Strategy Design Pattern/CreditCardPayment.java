/**
 * CreditCardPayment class implements the PaymentStrategy interface.
 * It simulates payment using a credit card.
 */
public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    /**
     * Constructor to initialize the credit card number.
     *
     * @param cardNumber The credit card number.
     */
    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * Processes payment using the credit card.
     *
     * @param amount The amount to be paid.
     */
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card with card number: " + cardNumber);
    }
}

