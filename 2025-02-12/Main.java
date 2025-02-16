import entities.Product;
import entities.TV;
import entities.Refrigerator;
import entities.Stove;
import entities.ShoppingCart;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart(1);

        // Criando produtos
        Product tv = new TV("Roku", 1200.00, 55);
        Product refrigerator = new Refrigerator("Samsung", 2500.00, 350);
        Product stove = new Stove("Consul", 1800.00, 4);

        // Adicionando produtos ao carrinho
        cart.addProduct(tv);
        cart.addProduct(refrigerator);
        cart.addProduct(stove);

        // Exibindo os itens do carrinho antes da remoção
        System.out.println("Itens no carrinho antes da remoção:");
        System.out.println(cart.getContents());
        System.out.println("Total items: " + cart.getItemCount());
        System.out.println("Total price: R$ " + cart.getTotalPrice());

        // Removendo um produto
        cart.removeProduct(stove);

        // Exibindo os itens do carrinho após a remoção
        System.out.println("\nItens no carrinho após a remoção:");
        System.out.println(cart.getContents());
        System.out.println("Total items: " + cart.getItemCount());
        System.out.println("Total price: R$ " + cart.getTotalPrice());

        scanner.close();
    }
}
