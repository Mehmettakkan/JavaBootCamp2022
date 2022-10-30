public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 5;
        boolean varMi = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == aranacak) {
                varMi = true;
                break;
            }
        }

      /*  for (int number : numbers) {
            if (number == aranacak) {
                varMi = true;
                break;
            }
        }*/

        if (varMi) {
            System.out.println("Sayi mevcuttur.");
        } else {
            System.out.println("Sayi mevcut degildir.");
        }
    }
}
