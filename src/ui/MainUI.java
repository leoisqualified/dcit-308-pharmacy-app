import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Pharmacy Management System");

        Button btnAddDrug = new Button("Add Drug");
        Button btnViewDrugs = new Button("View Drugs");
        Button btnAddSupplier = new Button("Add Supplier");
        Button btnViewSuppliers = new Button("View Suppliers");
        Button btnViewPurchaseHistory = new Button("View Purchase History");

        btnAddDrug.setOnAction(e -> AddDrugUI.display());
        btnViewDrugs.setOnAction(e -> ViewDrugsUI.display());
        btnAddSupplier.setOnAction(e -> AddSupplierUI.display());
        btnViewSuppliers.setOnAction(e -> ViewSuppliersUI.display());
        btnViewPurchaseHistory.setOnAction(e -> PurchaseHistoryUI.display());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(btnAddDrug, btnViewDrugs, btnAddSupplier, btnViewSuppliers, btnViewPurchaseHistory);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
