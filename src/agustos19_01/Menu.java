package agustos19_01;

import java.util.Scanner;

public class Menu {
    static Scanner scan=new Scanner(System.in);
    static void menu(){
        System.out.print("ŞEÇMEK İSTEDİĞİNİZ GEOMETRİK ŞEKLİ GİRİNİZ:\n" +
                "1. ÇEMBER\n" +
                "2. DİKDÖRTGEN\n" +
                "3. KARE\n" +
                "4. ÇIKIŞ\n" +
                "SEÇİMİNİZ: ");
        int secim=scan.nextInt();
        switch (secim){
            case 1:{
                cemberOlustur();
            }
            case 2:
            case 3:
            case 4:
            default:{
                System.out.println("YANLIŞ DEĞER GİRDİNİZ....");
                menu();
            }
        }
    }

    private static void cemberOlustur() {
        System.out.print("ÇEMBERİN YARIÇAPINI GİRİNİZ: ");
        double yariCap=scan.nextDouble();
        Cember cember=new Cember(yariCap);
        System.out.println(cember);
        menu();
    }
}
