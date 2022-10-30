public class CustomerManager {

//    ICustomerDal customerDal;
//
//    public void add() {
//
//        customerDal.add();
//    } // Bu birinci yöntemdi çok tercih edilmiyor.

    private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    public void add() {
        customerDal.add();
    }


}
