
package benimsorum;

public abstract class Ekle {
    protected int id;
    protected String isim;
    protected String soyIsim;
    protected String ePost;

     Ekle( int id, String isim , String soyIsim )
     {
     this.id = id;
     this.isim = isim;
     this.soyIsim = soyIsim;
     }
    
     Ekle( int id, String isim , String soyIsim , String ePost)
    {
     this.id = id;
     this.isim = isim;
     this.soyIsim = soyIsim;
     this.ePost = ePost;
    }
    
}
