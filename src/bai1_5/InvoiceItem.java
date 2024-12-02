package bai1_5;

public class InvoiceItem {
    private String id;
    private String description;
    private int quantity;
    private double unitPrice;

    public InvoiceItem(String id, String description, int quantity, double unitPrice) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotalPrice() {
        return quantity * unitPrice;
    }
    @Override
    public String toString() {
        return "InvoiceItem [ID=" + id + ", Description=" + description +
                ", Quantity=" + quantity + ", Unit Price=" + unitPrice +
                ", Total Price=" + getTotalPrice() + "]";
    }
}
