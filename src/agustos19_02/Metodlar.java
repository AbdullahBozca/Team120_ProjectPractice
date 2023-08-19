package agustos19_02;

import java.util.ArrayList;
import java.util.Scanner;

public class Metodlar {
    /*
    ATM
Kullanicidan giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,


Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis islemleri olacaktır.


Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,

Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.

Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
     */
    ArrayList<Kullanici> kullaniciList = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    void bakiyeSorgula() {
        String kartNo = scan.nextLine();
        boolean flag = true;
        for (Kullanici each : kullaniciList) {
            if (each.getKartNo().equals(kartNo)) {
                System.out.println(kartNo + " ait bakiye= " + each.getBakiye());
                flag=false;
            }
        }
        if (flag){
            System.out.println("hatalı giriş yaptınız...");
            bakiyeSorgula();
        }
    }

    void paraYatirma() {
        String kartNo = scan.nextLine();
        boolean flag = true;
        for (Kullanici each : kullaniciList) {
            if (each.getKartNo().equals(kartNo)) {
                System.out.print("YATIRMAK İSTEDİĞİNİZ MİKTARI GİRİNİZ: ");
                double miktar = scan.nextDouble();
                each.setBakiye(miktar + each.getBakiye());//sıradaki kullanıcının bakiyesine miktarı o andaki bakiye ile toplayarak update ettik
                System.out.println("Bakiyeniz=" + each.getBakiye());
                flag = false;
            }
        }
        if (flag) {
            System.out.println("hatali giriş yaptınız.....");
            paraYatirma();
        }
    }

    void paraCekme() {
        String kartNo = scan.nextLine();
        boolean flag=true;
        for (Kullanici each: kullaniciList) {
            if (each.getKartNo().equals(kartNo)){
                //Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
                System.out.print("Çekmek istediğiniz miktarı giriniz: ");
                double miktar= scan.nextDouble();
                if (miktar<=each.getBakiye()){
                    each.setBakiye(each.getBakiye()-miktar);
                    System.out.println("Bakiyeniz: "+ each.getBakiye());
                }else {
                    System.out.println("Yetersiz bakiye....");
                    paraCekme();
                }
                flag=false;
            }
        }
        if (flag){
            System.out.println("Hatalı giriş yaptınız....");
            paraCekme();
        }

    }
}
