public class ProductManager {

     //Parametrili metot bu
    public void ekle(Product product) {

        //JBDC veri tabanına kayıt ederiz.
        System.out.println("Ürün eklendi " + product.getName());


    }
}
