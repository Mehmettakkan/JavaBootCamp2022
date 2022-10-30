public class ProductValidator {

    static {
        System.out.println("Static blok çalıştı.");
    }

    public ProductValidator() {
        System.out.println("Constructer Çalıştı.");
    }//Constructer çalışması için nesne oluşturmamız lazım.(Yani new'lememiz lazım)


    public static boolean isValid(Product product) {

        if ((product.price > 0) && (!product.name.isEmpty())) {
            return true;
        } else {
            return false;
        }
        //!isEmpty();=>String değerin boş değil ise demek.(Yani değer girili ise demek)
        //Static tanımlanan metodu nesne üretmeden clas ismini yazarak ulaşabiliriz.
        //New yaptığımızda oluşan örnek işimiz bittiğinde bellekten atılıyordu.
        //Fakat static tanımladığımızda bellekten atılmıyor.(Sıfırlayana kadar bellekten atılmaz)
        //Manager sınıfları static yapma.
        //Ana Clas static olamaz.
        //Ana Clasın içine başka bir clas eklediğimizde metotları static olarak kullanabilmek için
        // clasta static olması lazım.

    }

    public static class innerClas {
        public static void sil() {
            //Bu clasın ismi inner clas ve metotları static olması için kendiside static olmalı.
        }
    }
}
