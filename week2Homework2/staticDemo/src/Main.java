public class Main {

    public static void main(String[] args) {

        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.name = "Maus";
        product.price = 10;
        manager.add(product);

        DataBaseHelper.Connection.createConnection();//Bu şekilde kullanılıyor ama kullanma kullanışlı değil.


    }
}