package bai1_5;

public class Main {
    public static void main(String[] args){
        InvoiceItem invoiceitem = new InvoiceItem("005", "Laptop", 2, 750);
        System.out.println(invoiceitem.toString());
        System.out.println("Total Price: " + invoiceitem.getTotalPrice());

    }
}

