import java.time.LocalDate;

public class PurchaseHistory {
    public String drugCode;
    public int quantityPurchased;
    public LocalDate purchaseDate;

    public PurchaseHistory(String drugCode, int quantityPurchased, LocalDate purchaseDate) {
        this.drugCode = drugCode;
        this.quantityPurchased = quantityPurchased;
        this.purchaseDate = purchaseDate;
    }

    @Override
    public String toString() {
        return "Drug Code: " + drugCode + ", Quantity Purchased: " + quantityPurchased + ", Purchase Date: " + purchaseDate;
    }
}
