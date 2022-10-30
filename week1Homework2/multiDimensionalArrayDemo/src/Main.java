
public class Main {

    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "istanbul";
        sehirler[0][1] = "Kocaeli";
        sehirler[0][2] = "Çanakkale";
        sehirler[1][0] = "Konya";
        sehirler[1][1] = "Ankara";
        sehirler[1][2] = "Sivas";
        sehirler[2][0] = "Kahramanmaraş";
        sehirler[2][1] = "Gaziantep";
        sehirler[2][2] = "Adana";
        for (int i = 0; i <= 2; i++) {
            System.out.println("-------------");
            for (int j = 0; j <= 2; j++) {
                System.out.println(sehirler[i][j]);
            }
        }
    }
}
