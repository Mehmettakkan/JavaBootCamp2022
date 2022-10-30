public class Main {

    public static void main(String[] args) {
        Product product = new Product(1, "Laptop", "Asus", 5000, 3, "Siyah");

        //Getter ve setterleri kullanırsak aşağıdakileri yazmak zorundayız fakat
        // Constructor kullanırsak yukarıdaki kısa kodu yazarız.aşağıda uzun uzun değer vermemize gerek kalmaz.
        /* Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus");
        product.setPrice(5000);
        product.setStockAmount(3);*/

        //Bir clas sadece bir is yapar!

        ProductManager productManager = new ProductManager();

        productManager.ekle(product);

        System.out.println(product.getKod());

    }
}
