package ui;

import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import model.PharmacyManagementSystem;
import model.Drug;

public class ViewDrugsUI {

    public static void display() {
        Stage window = new Stage();
        window.setTitle("View Drugs");

        ListView<String> listView = new ListView<>();

        // Assuming PharmacyManagementSystem instance is accessible
        PharmacyManagementSystem pms = new PharmacyManagementSystem();
        for (Drug drug : pms.getDrugs()) {
            listView.getItems().add(drug.toString());
        }

        Scene scene = new Scene(listView, 300, 250);
        window.setScene(scene);
        window.show();
    }
}
