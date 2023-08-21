package agustos19_02;

public class Runner extends Metodlar{
    public static void main(String[] args) {
        Kullanici kullanici1=new Kullanici("1234",1234,50000);
        kullaniciList.add(kullanici1);
        Kullanici kullanici2=new Kullanici("5678",1234,50000);
        kullaniciList.add(kullanici2);
        Kullanici kullanici3=new Kullanici("9123",1234,50000);
        kullaniciList.add(kullanici3);
        Kullanici kullanici4=new Kullanici("4567",1234,50000);
        kullaniciList.add(kullanici4);
        Kullanici kullanici5=new Kullanici("8912",1234,50000);
        kullaniciList.add(kullanici5);
        Menu menu=new Menu();
        menu.giris();
    }
}
