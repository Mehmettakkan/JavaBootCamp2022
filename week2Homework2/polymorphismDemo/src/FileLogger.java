public class FileLogger extends BaseLogger {
    // FileLogger => dosyaya kayıt etme

    @Override
    public void log(String message) {
        System.out.println("Dosyaya kayıt edildi :" + message);
    }
}
