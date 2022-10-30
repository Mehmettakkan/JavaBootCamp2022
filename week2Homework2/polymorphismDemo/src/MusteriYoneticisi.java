public class MusteriYoneticisi {

    private BaseLogger logger;

    //Constructer
    public MusteriYoneticisi(BaseLogger logger) {
        this.logger = logger;
    }

    public void ekle() {
        System.out.println("Müşteri eklendi ");
        this.logger.log("log message");

//        DatabaseLogger logger = new DatabaseLogger();
//        logger.log("log message"); Bu kullanım yanlıştır. Yukarıdaki doğrudur.
    }

}
