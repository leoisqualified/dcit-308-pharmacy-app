package ui;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.PharmacyManagementSystem;
import model.Supplier;

public class AddSupplierUI {

    public static void display() {
        Stage window = new Stage();
        window.setTitle("Add Supplier");

        GridPane layout = new GridPane();
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.setVgap(8);
        layout.setHgap(10);

        Label idLabel = new Label("Supplier ID:");
        GridPane.setConstraints(idLabel, 0, 0);
        TextField idInput = new TextField();
        GridPane.setConstraints(idInput, 1, 0);

        Label nameLabel = new Label("Name:");
        GridPane.setConstraints(nameLabel, 0, 1);
        TextField nameInput = new TextField();
        GridPane.setConstraints(nameInput, 1, 1);

        Label locationLabel = new Label("Location:");
        GridPane.setConstraints(locationLabel, 0, 2);
        TextField locationInput = new TextField();
        GridPane.setConstraints(locationInput, 1, 2);

        Button addButton = new Button("Add Supplier");
        GridPane.setConstraints(addButton, 1, 3);
        addButton.setOnAction(e -> {
            // Add logic to handle adding the supplier
            String id = idInput.getText();
            String name = nameInput.getText();
            String location = locationInput.getText();

            Supplier newSupplier = new Supplier(id, name, location);
            // Assuming PharmacyManagementSystem instance is accessible
            PharmacyManagementSystem pms = new PharmacyManagementSystem();
            pms.addSupplier(newSupplier);

            window.close();
        });

        layout.getChildren().addAll(idLabel, idInput, nameLabel, nameInput, locationLabel, locationInput, addButton);

        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }
}
