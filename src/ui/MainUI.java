package ui;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Pharmacy Management System");

        // Create heading
        Label heading = new Label("Pharmacy Management System");
        heading.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");

        // Create buttons
        Button btnAddDrug = new Button("Add Drug");
        Button btnViewDrugs = new Button("View Drugs");
        Button btnAddSupplier = new Button("Add Supplier");
        Button btnViewSuppliers = new Button("View Suppliers");
        Button btnViewPurchaseHistory = new Button("View Purchase History");

        // Set button actions
        btnAddDrug.setOnAction(e -> AddDrugUI.display());
        btnViewDrugs.setOnAction(e -> ViewDrugsUI.display());
        btnAddSupplier.setOnAction(e -> AddSupplierUI.display());
        btnViewSuppliers.setOnAction(e -> ViewSuppliersUI.display());
        btnViewPurchaseHistory.setOnAction(e -> PurchaseHistoryUI.display());

        // Create layout and set alignment
        VBox layout = new VBox(10);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(heading, btnAddDrug, btnViewDrugs, btnAddSupplier, btnViewSuppliers, btnViewPurchaseHistory);

        // Set background image
        Image backgroundImage = new Image("file:background.jpg"); // Update this path as necessary
        BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, false));
        layout.setBackground(new Background(background));

        // Create scene and add layout
        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
