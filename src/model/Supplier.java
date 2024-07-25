public class Supplier {
    public String supplierID;
    public String name;
    public String location;

    public Supplier(String supplierID, String name, String location) {
        this.supplierID = supplierID;
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Supplier ID: " + supplierID + ", Name: " + name + ", Location: " + location;
    }
}
