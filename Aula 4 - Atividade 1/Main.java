import entities.Product;
import entities.ShoppingCart;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart(1); // Criando um carrinho para o cliente de ID 1

        // Criando produtos
        Product notebook = new Product("Notebook", 2500.00);
        Product mouse = new Product("Mouse", 150.00);
        Product teclado = new Product("Teclado", 200.00);
        Product monitor = new Product("Monitor", 1200.00);

        // Adicionando produtos ao carrinho
        cart.addProduct(notebook);
        cart.addProduct(mouse);
        cart.addProduct(teclado);
        cart.addProduct(monitor);

        // Exibindo os itens do carrinho antes da remoção
        System.out.println("Itens no carrinho antes da remoção:");
        System.out.println(cart.getContents());
        System.out.println("Total de itens: " + cart.getItemCount());
        System.out.println("Preço total: R$ " + cart.getTotalPrice());

        // Removendo um produto
        cart.removeProduct(mouse);

        // Exibindo os itens do carrinho após a remoção
        System.out.println("\nItens no carrinho após a remoção:");
        System.out.println(cart.getContents());
        System.out.println("Total de itens: " + cart.getItemCount());
        System.out.println("Preço total: R$ " + cart.getTotalPrice());

        scanner.close();
    }
}
