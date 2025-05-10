package KalıtımOrnek;

import org.w3c.dom.ls.LSOutput;

public class Kalıtım {
    public static void main(String[] args) {
       /* Dikdortgen d1 = new Dikdortgen(10, 20);
        Dikdortgen d2 = new Dikdortgen(15, 35);
        d1.OzellikleriniYazdir();
        System.out.println(d1);


        //tostring bolumunu degiştirdim otomatik oluyor onlar arka planda override yaptım yani
        GeometrikSekil gs1=new GeometrikSekil(5,10);
        System.out.println(gs1);
       */
        Kare k1=new Kare(10);
        k1.alanHesapla();
        k1.cevreHesapla();
    }
}
class GeometrikSekil {
    private int en;
    private int boy;
    // a ve b diye sınıf varsa once a static sonra b static sonra a blok a constructer b blok b constructer çalışır.
    //bu alanlara erişmek için constructer oluşturuyoruz
    //static metotları her hangi bir nesne üretmeden cagırabiliyoruz.
    // yapılandırıcı yani
    public GeometrikSekil(int en,int boy) {
        this.en = en;
        this.boy = boy;
        System.out.println("Geometrik şekil oluşturuluyor...");
    }
    public GeometrikSekil() {
        System.out.println("Geometrik şekil oluşturuluyor...");
    }

    public GeometrikSekil(int en) {
        this.en = en;
        System.out.println("Geometrik şekil oluşturuluyor...");
    }

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }
    public void alanHesapla() {
        System.out.println("Alan Hesapla:" + (en*boy));
    }
    public void cevreHesapla() {
        System.out.println("Cevre Hesapla:" + ((en+boy)*2));
    }
    public String toString() {
        return "en: "+en+", boy: "+boy;
    }
}
// static bloklar 1 kereye mahsus calışır sınıfa ozgu.
// static ve kod bloklarında ilk a ve b var diyelim sınıflar a nın statiklerii calışır sonra a boş blok sonra constructer a sonra b blok constructer A
// getEn() değeri okumak içindir
//➤ setEn(...) değeri değiştirmek (atamak) içindir

class Dikdortgen extends GeometrikSekil {
    public Dikdortgen(int en,int boy) {
        setEn(en);
        setBoy(boy);
        System.out.println("Dikdortgen oluşturuluyor...");
    }
    public Dikdortgen(int en) {
        setEn(en);
        System.out.println("DikDörtgen oluşturuluyor...");
    }
    public void OzellikleriniYazdir(){
        System.out.println("Geometrik Seklin eni= "+getEn()+" Boyu= "+getBoy());
        alanHesapla();
        cevreHesapla();
    }
    //bu 2. toString yani miraslama yaptık degiştirdik begenmedik
    public String toString() {
        return "enimiz: "+getEn()+" Boyu= "+getBoy();
    }

}

