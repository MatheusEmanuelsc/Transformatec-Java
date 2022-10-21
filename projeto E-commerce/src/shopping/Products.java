package shopping;

import java.util.ArrayList;
import java.util.List;



public class Products {
    
    private List<Product> products = new ArrayList<Product>();


    public Products() {
        this.storeItems();
    }

    public List<Product> getProducts(){
        return products;
    }


    private void storeItems() {

        this.products.add(new Product(products.size(), "Perfume", "avon", "legal", 100.00, 20.00));
        this.products.add(new Product(products.size(), "Sabonete", "Boticário", "macio", 15.00, 35.00));
        this.products.add(new Product(products.size(), "Oleo Mineral", "Boticário", "Bem cheiroso", 30.00, 10.00));
        this.products.add(new Product(products.size(), "Shampoo", "Boticário", "Bom", 100.00, 15.00));
        this.products.add(new Product(products.size(), "Desodorante", "rexona", "Cheiro bom", 8.00, 10.00));
        this.products.add(new Product(products.size(), "Creme de mão", "Boticário", "Barato", 5.00, 10.00));
        this.products.add(new Product(products.size(), "Batom", "Boticário", "Bonito", 50.00, 10.00));


    }

}