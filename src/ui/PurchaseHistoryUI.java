package ui;

import model.PharmacyManagementSystem;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class PurchaseHistoryUI {

    public static void display() {
        Stage window = new Stage();
        window.setTitle("View Purchase History");

        ListView<String> listView = new ListView<>();

        // Assuming PharmacyManagementSystem instance is accessible
        PharmacyManagementSystem pms = new PharmacyManagementSystem();
        for (PurchaseHistory history : pms.getPurchaseHistories()) {
            listView.getItems().add(history.toString());
        }

        Scene scene = new Scene(listView, 300, 250);
        window.setScene(scene);
        window.show();
    }
}
