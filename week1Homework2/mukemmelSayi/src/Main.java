public class Main {
    public static void main(String[] args) {

        //6 --> 3+2+1 = 6
        //28 --> 1+2+4+7+14 = 28

        int number = 28, total = 0;

        System.out.print(number + " sayisinin bolenleri:");

        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                System.out.print(i + ",");
                total += i;
            }

        }

        System.out.println();
        if (total == number) {
            System.out.println(number + " sayisi mukemmel sayidir.");
        } else {
            System.out.println("Sayi mukemmel degildir.");
        }

    }
}
