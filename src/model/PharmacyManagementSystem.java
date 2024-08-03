package model;

import java.util.ArrayList;
import java.util.List;

public class PharmacyManagementSystem {
    private List<Drug> drugs;
    private List<Supplier> suppliers;
    private List<PurchaseHistory> purchaseHistories;

    // Singleton instance
    public static PharmacyManagementSystem instance;

    public PharmacyManagementSystem() {
        drugs = new ArrayList<>();
        suppliers = new ArrayList<>();
        purchaseHistories = new ArrayList<>();
    }

    public static PharmacyManagementSystem getInstance() {
        if (instance == null) {
            instance = new PharmacyManagementSystem();
        }
        return instance;
    }

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
