public class Product<_name> {
    // Public => Halka açık yani bütün bloklarda kullanılabiliriz.
    // Private => sadece tanımlandığı blokta geçerlidir.(İki blok arası)
    // Protected => sadece o sınıf ve sınıfı extends eden sınıflar kullanır.

    //attribute || field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String kod;
    private String renk;

    //Bu aşağıdaki Constructor

    public Product(int id, String name, String description, double price, int stockAmount, String renk) {
        System.out.println("Yapıcı blok çalıştı.");

        this.id = id;//Böyle diyelim ki parametri ile gönderdiğimiz değerler bu clas içinde kullanılsın.
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
        this.renk = renk;
    }

    public Product() {

    }

    //getter
    public int getId() {

        return id;
    }

    //setter
    //this bıu prductun id eşit demek
    // this içerisinde bulunduğum clas demek.
    public void setId(int id) {
        //id = id;
        this.id = id;
        //id = id;
    }

    public String get_name() {

        return getName();
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public int getStockAmount() {

        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {

        this.stockAmount = stockAmount;
    }

    public String getKod() {

        return this.name.substring(0, 1) + id;
    }


}
