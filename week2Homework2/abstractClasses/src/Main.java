public class Main {

    public static void main(String[] args) {

        KadinPuanHesaplama kadinPuanHesaplama = new KadinPuanHesaplama();
        kadinPuanHesaplama.hesapla();
        kadinPuanHesaplama.gameOver();

        //abstract clasları böyle kullan
        BasePuanHesaplama basePuanHesaplama = new KadinPuanHesaplama();

    }
}
