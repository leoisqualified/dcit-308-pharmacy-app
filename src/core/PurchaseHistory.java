import java.time.LocalDateTime;

public class PurchaseHistory {
    private String drugCode;
    private LocalDateTime purchaseTime;
    private int quantity;
    private double totalAmount;
    private String buyer;

    public PurchaseHistory(String drugCode, LocalDateTime purchaseTime, int quantity, double totalAmount, String buyer) {
        this.drugCode = drugCode;
        this.purchaseTime = purchaseTime;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
        this.buyer = buyer;
    }

    // Getters and Setters
}
