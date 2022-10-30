public class Main {

    public static void main(String[] args) {
        double[] myList = {1.8, 5.6, 3.4, 6.6, 9.0};
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Toplamı = " + total);
        System.out.println("En büyük = " + max);
    }
}
