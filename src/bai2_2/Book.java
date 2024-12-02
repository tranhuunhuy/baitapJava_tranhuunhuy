package bai2_2;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;


    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = 0;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }


    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }


    public String getAuthorNames() {
        StringBuilder authorNames = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            authorNames.append(authors[i].getName());
            if (i < authors.length - 1) {
                authorNames.append(", ");
            }
        }
        return authorNames.toString();
    }


    @Override
    public String toString() {
        String authorsString = getAuthorNames();
        return "Book[name=" + name + ", authors={" + authorsString + "}, price=" + price + ", qty=" + qty + "]";
    }
}
