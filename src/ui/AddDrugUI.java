package ui;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.Drug;
import model.PharmacyManagementSystem;

public class AddDrugUI {

    public static void display() {
        Stage window = new Stage();
        window.setTitle("Add Drug");

        GridPane layout = new GridPane();
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.setVgap(8);
        layout.setHgap(10);

        Label codeLabel = new Label("Drug Code:");
        GridPane.setConstraints(codeLabel, 0, 0);
        TextField codeInput = new TextField();
        GridPane.setConstraints(codeInput, 1, 0);

        Label nameLabel = new Label("Name:");
        GridPane.setConstraints(nameLabel, 0, 1);
        TextField nameInput = new TextField();
        GridPane.setConstraints(nameInput, 1, 1);

        Label supplierLabel = new Label("Supplier:");
        GridPane.setConstraints(supplierLabel, 0, 2);
        TextField supplierInput = new TextField();
        GridPane.setConstraints(supplierInput, 1, 2);

        Label priceLabel = new Label("Price:");
        GridPane.setConstraints(priceLabel, 0, 3);
        TextField priceInput = new TextField();
        GridPane.setConstraints(priceInput, 1, 3);

        Label quantityLabel = new Label("Quantity:");
        GridPane.setConstraints(quantityLabel, 0, 4);
        TextField quantityInput = new TextField();
        GridPane.setConstraints(quantityInput, 1, 4);

        Button addButton = new Button("Add Drug");
        GridPane.setConstraints(addButton, 1, 5);
        addButton.setOnAction(e -> {
            String code = codeInput.getText();
            String name = nameInput.getText();
            String supplier = supplierInput.getText();
            double price = Double.parseDouble(priceInput.getText());
            int quantity = Integer.parseInt(quantityInput.getText());

            Drug newDrug = new Drug(code, name, supplier, price, quantity);
            PharmacyManagementSystem pms = PharmacyManagementSystem.getInstance();
            pms.addDrug(newDrug);

            window.close();
        });

        layout.getChildren().addAll(codeLabel, codeInput, nameLabel, nameInput, supplierLabel, supplierInput, priceLabel, priceInput, quantityLabel, quantityInput, addButton);

        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }
}
