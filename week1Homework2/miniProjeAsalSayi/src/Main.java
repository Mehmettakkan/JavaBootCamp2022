import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;

        System.out.print("Bir sayı giriniz = ");
        number = scan.nextInt();

        //int remainder = number % 2;
        boolean isPrime = true;

        if (number == 1) {
            System.out.println("Sayı asal değildir.");
            return; //Diger komutlari okuma burda bitir demektir.
        }
        if (number < 1) {
            System.out.println("Geçersiz sayı girdiniz.");
            return;
        }


        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("Asal sayıdır.");
        } else {
            System.out.println("Asal sayı değildir.");
        }
    }
}
