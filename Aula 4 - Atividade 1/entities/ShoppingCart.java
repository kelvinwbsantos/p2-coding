package entities;

import java.util.ArrayList;

public class ShoppingCart {
    private int customerID;
    private ArrayList<Product> products;

    public ShoppingCart(int customerID) {
        this.customerID = customerID;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public String getContents() {
        return products.toString();
    }

    public int getCustomerID() {
        return customerID;
    }

    public int getItemCount() {
        return products.size();
    }

    public double getTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }



}
