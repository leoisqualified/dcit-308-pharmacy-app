package ui;

import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import core.PharmacyManagementSystem;

public class ViewSuppliersUI {

    public static void display() {
        Stage window = new Stage();
        window.setTitle("View Suppliers");

        ListView<String> listView = new ListView<>();

        // Assuming PharmacyManagementSystem instance is accessible
        PharmacyManagementSystem pms = new PharmacyManagementSystem();
        for (Supplier supplier : pms.getSuppliers()) {
            listView.getItems().add(supplier.toString());
        }

        Scene scene = new Scene(listView, 300, 250);
        window.setScene(scene);
        window.show();
    }
}
