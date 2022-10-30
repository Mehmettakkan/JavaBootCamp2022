public class DatabaseLogger extends BaseLogger {

    // DatabaseLogger => Veritabanına Kayıt etme
    @Override
    public void log(String message) {
        System.out.println("Veritabanına kayıt edildi :" + message);
    }

}
