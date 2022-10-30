public class ProductManager {

//    public void add(Product product) {
//
//        ProductValidator productValidator = new ProductValidator();
//        //Constructer nesne oluştuduğumuz zaman çalışır.
//
//        if (productValidator.isValid(product)) {
//            System.out.println("Eklendi.");
//        } else {
//            System.out.println("Ürün bilgileri geçersiz.");
//        }
//    } //Bu kod staticsiz

    public void add(Product product) {
        if (ProductValidator.isValid(product)) { //-> Static blokta burdan dolayı çalışır.
            System.out.println("Eklendi.");
        } else {
            System.out.println("Ürün bilgileri geçersiz.");
        }
    }//Bu staticli


}
