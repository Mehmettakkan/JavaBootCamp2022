public class CustomerManager {

    BaseDatabaseManager baseDatabaseManager;


    public void getCustomers() {

        baseDatabaseManager.getData();
//        OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
//      oracleDatabaseManager.getData(); //Bu yanlış kullanımdır Oracleye bağımlı oluyoruz.

    }


}
