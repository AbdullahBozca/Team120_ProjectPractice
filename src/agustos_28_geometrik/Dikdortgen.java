package agustos_28_geometrik;

public class Dikdortgen implements Igeometrik{
    int kısaKenar,uzunKenar;

    public Dikdortgen(int kısaKenar, int uzunKenar) {
        this.kısaKenar = kısaKenar;
        this.uzunKenar = uzunKenar;
    }

    @Override
    public void alan() {
        System.out.println("Dikdörtgenin alanı :"+ (kısaKenar*uzunKenar));
    }

    @Override
    public void cevre() {
        System.out.println("Dikdörtgenin çevresi: "+(2*(kısaKenar+uzunKenar)));
    }
}
