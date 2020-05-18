
package benimsorum;

public class SoyutYonet extends Ekle
{
    
    public SoyutYonet(int id, String isim, String soyIsim)
    {
        super(id, isim, soyIsim);
        super.ePost  = "Tanımlı Eposta bulunmadı.";
                System.out.println("Kişi kaydedildi. "+id+" "+isim+" "+" "+soyIsim+" "+ePost);
    }
       
    public SoyutYonet(int id, String isim, String soyIsim, String ePost) 
    {
        super(id, isim, soyIsim, ePost);
          System.out.println("Kişi kaydedildi. "+id+" "+isim+" "+" "+soyIsim+" "+ePost);
    }
    
}
