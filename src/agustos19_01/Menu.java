package agustos19_01;

import java.util.Scanner;

public class Menu {
    static Scanner scan = new Scanner(System.in);

    static void menu() {
        System.out.print("ŞEÇMEK İSTEDİĞİNİZ GEOMETRİK ŞEKLİ GİRİNİZ:\n" +
                "1. ÇEMBER\n" +
                "2. DİKDÖRTGEN\n" +
                "3. KARE\n" +
                "4. ÇIKIŞ\n" +
                "SEÇİMİNİZ: ");
        int secim = scan.nextInt();
        switch (secim) {
            case 1: {
                cemberOlustur();

            }
            case 2:
                dikdortgenOlustur();
            case 3:
                kareOlustur();
            case 4:
                System.exit(0);
            default: {
                System.out.println("YANLIŞ DEĞER GİRDİNİZ....");
                menu();
            }
        }
    }

    private static void kareOlustur() {
        System.out.println("KARENİN KENAR UZUNLUĞUNU GİRİNİZ: ");
        double kenarUzunlugu=scan.nextDouble();
        Kare kare=new Kare(kenarUzunlugu,kenarUzunlugu);
        System.out.println(kare);
        menu();
    }

    private static void dikdortgenOlustur() {
        System.out.print("UZUN KENARI GİRİNİZ: ");
        double uzunKenar = scan.nextDouble();
        System.out.print("KISA KENARI GİRİNİZ: ");
        double kisaKenar = scan.nextDouble();
        Dikdortgen dikdortgen = new Dikdortgen(uzunKenar, kisaKenar);
        System.out.println(dikdortgen);
        menu();
    }

    private static void cemberOlustur() {
        System.out.print("ÇEMBERİN YARIÇAPINI GİRİNİZ: ");
        double yariCap = scan.nextDouble();
        Cember cember = new Cember(yariCap);
        System.out.println(cember);
        menu();
    }
}
