package shopping;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    List<Product> cartItems = new ArrayList<Product>();


    public void addProduct(Integer id) {
        
        Product product = getProductById(id);
        addToCart(product);

    }

    private void addToCart(Product product) {

        cartItems.add(product);

    }

    public void removeProduct(Integer id) {
        Product product = getProductById(id);
        cartItems.remove(product);
    }

    private Product getProductById(Integer id) {

        Product product = null;
        

        List<Product> products = new Products().getProducts();
        

        for (Product prod : products) {
            
            if (prod.getId() == id) {

                product = prod;
            }

        }

        return product;
    }

    
    public void printCart(){
        for (Product product : cartItems) {
            System.out.println("Nome do produto: " + product.getName());
            System.out.println("Marca do produto: " + product.getName());
            System.out.println("Descricao do produto: " + product.getName());
            System.out.println("Preco do produto: " + product.getName());
            System.out.println();
        }
    }
    
}