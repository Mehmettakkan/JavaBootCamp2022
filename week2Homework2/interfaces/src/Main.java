public class Main {

    public static void main(String[] args) {

        ICustomerDal customerDal = new OracleCustomerDal();
        // Interfaceyi böyle kullanabiliriz.
        // Bu aynı zamanda Polymorphismdir.


//        CustomerManager customerManager = new CustomerManager();
//        customerManager.customerDal = new OracleCustomerDal();
//        customerManager.add(); //Birinci yöntem böyle çalışıyor

        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        customerManager.add();


    }
}
