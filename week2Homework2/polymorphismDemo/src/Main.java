public class Main {

    public static void main(String[] args) {

        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
        for (BaseLogger logger : loggers) {
            logger.log("log message");
        }
        System.out.println();

        MusteriYoneticisi musteriYoneticisi = new MusteriYoneticisi(new DatabaseLogger());
        musteriYoneticisi.ekle();
    }
}
