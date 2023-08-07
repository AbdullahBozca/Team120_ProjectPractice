package temmuz25;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    /*
    MOUNTAIN ARRAY: Verilen herhangi bir arrayin Mountanin Array olup olmadığını kontrol ediniz.
    Mountain array ==> [0,2,5,3,1]
    Bir array elemanları en büyük değerine kadar sürekli artan, en büyük değerden sonra sürekli azalan değer alıyorsa "Mountain Array" dir.
    Mountain array değildir ==>[5,2,7,1,4]
     */
    public static void main(String[] args) {
        System.out.print("Mountain array kontrolu yapılacak değerlerin arasına virgül koyarak giriniz: ");
        Scanner scan = new Scanner(System.in);
        String degerler = scan.next();
        String[] degerlerArr = degerler.split(",");
        int[] degerlerSayiArr = new int[degerlerArr.length];
        for (int i = 0; i < degerlerArr.length; i++) {
            degerlerSayiArr[i] = Integer.parseInt(degerlerArr[i]);
        }
        control(degerlerSayiArr);
    }

    public static void control(int[] degerlerSayiArr) {
        int enBuyuk = 0, enBuyukIndex = 0;
        boolean flag = false;
        for (int i = 0; i < degerlerSayiArr.length; i++) {
            if (enBuyuk < degerlerSayiArr[i]) {
                enBuyuk = degerlerSayiArr[i];
                enBuyukIndex = i;
            }
        }
        //başlangıçtan en büyük değere kadar artan kısım kontrolu
        for (int i = 0; i < enBuyukIndex; i++) {
            if (i != enBuyukIndex) {
                if (degerlerSayiArr[i] < degerlerSayiArr[i + 1]) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        }
        //en büyük değerden son indexe kadar olan kısım kontrolu
        for (int i = enBuyukIndex; i < degerlerSayiArr.length; i++) {
            if (i != degerlerSayiArr.length - 1) {
                if (degerlerSayiArr[i] > degerlerSayiArr[i + 1]) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println(Arrays.toString(degerlerSayiArr) + " arrayi mountain arraydir");
        } else {
            System.out.println(Arrays.toString(degerlerSayiArr) + " arrayi mountain array değildir");
        }
    }
}
