
package benimsorum;

import java.util.Scanner;

public class BenimSorum {

    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   SoyutYonet sy;
   String ad;
   String soyad;
   String ePost;
   String kontrl;
   int id;
   boolean kontrol = true;
   while(kontrol)
        {
            System.out.print("Eklenecek kişinin ID numarasını giriniz: "); 
            id = sc.nextInt();
            System.out.print("Eklenecek kişinin adını giriniz: ");
            ad = sc.next();
            System.out.print("Eklenecek kişinin soyadını giriniz: "); 
            soyad = sc.next();
            System.out.print("Eklenecek kişinin elektronik postasını giriniz: ");
            ePost = sc.next();
            
            if(ePost.equals(""))
            { 
             sy = new SoyutYonet(id, ad, soyad);
            }
            else
            {
            sy = new SoyutYonet(id, ad, soyad, ePost);
            } 
       System.out.print("İşleme devam edelim mi? E/H\t");  kontrl= sc.next().toUpperCase();
       switch(kontrl)
                     {
           case "E": break;
           case "H":kontrol=false; sc.close(); System.out.println("İşlem sonlandı."); break;
           default: System.out.println("Tanımsız işlem seçtiniz işleme devam ediliyor..."); break;
       
                     }
        }        
                                               }
}
