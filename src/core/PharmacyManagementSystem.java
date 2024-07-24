import java.util.ArrayList;
import java.util.List;

public class PharmacyManagementSystem {
    private List<Drug> drugs = new ArrayList<>();
    private List<Supplier> suppliers = new ArrayList<>();
    private List<PurchaseHistory> purchaseHistories = new ArrayList<>();

    public void addDrug(Drug drug) {
        drugs.add(drug);
    }

    public List<Drug> getDrugs() {
        return drugs;
    }

    public void addSupplier(Supplier supplier) {
        suppliers.add(supplier);
    }

    public List<Supplier> getSuppliers() {
        return suppliers;
    }

    public void addPurchaseHistory(PurchaseHistory history) {
        purchaseHistories.add(history);
    }

    public List<PurchaseHistory> getPurchaseHistories() {
        return purchaseHistories;
    }
}
