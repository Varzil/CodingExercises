/**
 * BitcoinPayment class implements the PaymentStrategy interface.
 * It simulates payment using Bitcoin.
 */
public class BitcoinPayment implements PaymentStrategy {
    private String walletAddress;

    /**
     * Constructor to initialize the Bitcoin wallet address.
     *
     * @param walletAddress The Bitcoin wallet address.
     */
    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    /**
     * Processes payment using Bitcoin.
     *
     * @param amount The amount to be paid.
     */
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Bitcoin wallet address: " + walletAddress);
    }
}
