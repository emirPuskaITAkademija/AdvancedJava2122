package one.product;

public class ProductTester {
    public static void main(String[] args) {
        Product product = new Product("12132", 10);
        product.print();
        Wine wine = new Wine("213112", 10);
        wine.print();
        Chocolate chocolate = new Chocolate("ewws", 10);
        chocolate.print();
    }
}
