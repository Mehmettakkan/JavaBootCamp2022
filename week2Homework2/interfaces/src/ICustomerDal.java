public interface ICustomerDal {

    void add();

    // interface abstract gibi nesne üretemez onun yerine Polymorphısm yapar.(Yani referans tutar)
    // extends ile implements arasındaki fark
    // extend sadece bir clası miras alır
    // implements ise birden fazla interface clası miras alir.
    // Data access layer(Dal)
    // implements clas aynı zamanda başka bir clası extends(miras) alabilir.

}
