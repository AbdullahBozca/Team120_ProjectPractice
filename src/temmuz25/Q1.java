package temmuz25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q1 {
    /*
  Girilen desimal değeri binary değere çeviren metodu oluşturunuz.
  Örnek: 12 = 1 1 0 0
   */
    public static void main(String[] args) {
        System.out.print("Desimal değer giriniz: ");
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();
        System.out.println(sayi + " desimal sayısının binary karşılığı: " + binaryConvert(sayi));
    }

    public static List<Integer> binaryConvert(int sayi) {
        List<Integer> binary = new ArrayList<>();
        while (sayi > 0) {
            binary.add(sayi % 2);
            sayi /= 2;
        }

        List<Integer> tersBinary = new ArrayList<>();
        for (int i = binary.size() - 1; i >= 0; i--) {
            tersBinary.add(binary.get(i));
        }

        //Collections.reverse(binary);
        return tersBinary;
    }
}
