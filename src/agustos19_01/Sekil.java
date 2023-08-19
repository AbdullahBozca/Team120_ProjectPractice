package agustos19_01;

public class Sekil {
    /*
    1-asagidaki hiyarasiye gore classlar creat ediniz...

     sekil <--Cember
     sekil <--Dikdortgen<--Kare

    2- Turetilen class'a uygun olanlarina yaricap,  uzunluk ve genislik veriable'ler ekleyiniz.
    3- Runner class'da  Cember Dikdortgen Kare alan ve cevre hesaplamasi yaptirip sonuclari yazdiriniz.

 */

    double uzunKenar;
    double kisaKenar;
    double yariCap;

    public Sekil(double uzunKenar, double kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    public Sekil(double yariCap) {
        this.yariCap = yariCap;
    }

    double cevreHesaplama(double yariCap){
        return 2*3.14*yariCap;
    }
    double alanHesapla(double yariCap){
        return 3.14*(yariCap*yariCap);
    }
    double cevreHesaplama(double uzunKenar,double kisaKenar){
        return (kisaKenar+uzunKenar)*2;
    }
    double alanHesapla(double uzunKenar,double kisaKenar){
        return (kisaKenar*uzunKenar);
    }
}

