import java.util.*;

public class PharmacyManagementSystem {
    private List<Drug> drugs;
    private List<Supplier> suppliers;
    private List<PurchaseHistory> purchaseHistories;

    public PharmacyManagementSystem() {
        drugs = new ArrayList<>();
        suppliers = new ArrayList<>();
        purchaseHistories = new ArrayList<>();
    }

    public void addDrug(Drug drug) {
        drugs.add(drug);
    }

    public Drug searchDrug(String drugCode) {
        for (Drug drug : drugs) {
            if (drug.getDrugCode().equals(drugCode)) {
                return drug;
            }
        }
        return null;
    }

    public void viewAllDrugs() {
        for (Drug drug : drugs) {
            System.out.println(drug);
        }
    }

    public void addSupplier(Supplier supplier) {
        suppliers.add(supplier);
    }

    public Supplier searchSupplier(String supplierId) {
        for (Supplier supplier : suppliers) {
            if (supplier.getSupplierId().equals(supplierId)) {
                return supplier;
            }
        }
        return null;
    }

    public void addPurchaseHistory(PurchaseHistory history) {
        purchaseHistories.add(history);
    }

    public void viewPurchaseHistory() {
        purchaseHistories.sort(Comparator.comparing(PurchaseHistory::getPurchaseTime));
        for (PurchaseHistory history : purchaseHistories) {
            System.out.println(history);
        }
    }

    public static void main(String[] args) {
        PharmacyManagementSystem pms = new PharmacyManagementSystem();
        
        // Example usage
        Drug drug1 = new Drug("D001", "Paracetamol", "Supplier1", 1.5, 100);
        pms.addDrug(drug1);
        
        Supplier supplier1 = new Supplier("S001", "Supplier1", "Location1");
        pms.addSupplier(supplier1);
        
        PurchaseHistory history1 = new PurchaseHistory("D001", LocalDateTime.now(), 10, 15.0, "Customer1");
        pms.addPurchaseHistory(history1);
        
        pms.viewAllDrugs();
        pms.viewPurchaseHistory();
    }
}
