public abstract class BasePuanHesaplama {

    //abstract bir clasta abstract bir metot olmak zorunda değil.
    //abstract clasları başka sınıfta çağırmayız yani abstract claslardan nesne üretemeyiz(yani new'lenmez).
    //Nesne üretebilmemiz için onun abstract metodunu Override etmemiz lazım
    //(yani nesnenin altına metodu aynı şekilde yazmamız lazım)=>Kullanışlı değil kullanma.
    //claslar ile abstract claslar birbirine benzer.

    public abstract void hesapla();
    // Bu şekilde kullanırsak hesapla metodunu miras alan sınıflar içermek zorunda ve hesaplayı Override etmek zorunda.
    // Yani miras alan her sınıf kendi hesaplamasını yazmak zorunda.
    // Abstract metot yazabilmemiz için Clasımız Abstract olması lazım.
    // Herkes puan hesaplamak zorunda olduğundan dolayı hepsi zorunlu şekilde Override edip kullanıcı
    // türüne göre puan hesaplamak zorundadır.


//    public void hesapla() {
//        System.out.println("Puanınız : 100");
//    }  //bu şekilde kullandığımız zaman  inheritance(miras) eden claslar default bir şekilde kullanabilir
//    (yani Override yapmak zorunda değillerdir.)

    //BasePuanHesaplama kim kullanıyorsa olduğu gibi kabul edecek değiştirmeyecek.
    //Bu bir tamamlanmış metot.
    public final void gameOver() {
        System.out.println("Oyun bitti.");
    }

}
