public class Main {

    public static void main(String[] args) {
        // For döngüsü
        for (int i = 1; i <= 10; i += 2) {
            System.out.print(i + ",");
        }
        System.out.println("For döngüsü bitti.");
        int a = 1;
        while (a < 10) {
            System.out.print(a + ",");
            a++;
        }
        System.out.println("While döngüsü bitti.");

        int b = 10;
        do {
            System.out.print(b + ",");
            b++;
        } while (b <= 20);
        System.out.println("Do-While döngüsü bitti.");


    }//infinlite loop(sonsuz döngü)
}
