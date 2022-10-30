public class Main {
    //Clas isimleri Pascal Case kuralına göre yazılır
    public static void main(String[] args) {
        sayiBulmaca();
        //Metotlar kendimizi tekrar etmememiz için kullanıyoruz.
    }

    //Metot ismi camel Casing
    static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 4, 5, 6, 7, 9, 0};
        int aranacak = 6;
        boolean varMi = false;
        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            System.out.println("Sayı mevcuttur = " + aranacak);
            // mesajVer(aranacak);
        } else {
            System.out.println("Sayı mevcut değildir = " + aranacak);
        }
    }

   /* public static void mesajVer(int aranacak) {
        System.out.println("Sayı mevcuttur = " + aranacak);

    }*/

}
