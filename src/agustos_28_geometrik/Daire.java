package agustos_28_geometrik;

public class Daire implements Igeometrik{
    int yariCap;

    public Daire(int yariCap) {
        this.yariCap = yariCap;
    }

    @Override
    public void alan() {
        System.out.println("Dairenin alanı: "+(3.14*(yariCap*yariCap)));
    }

    @Override
    public void cevre() {
        System.out.println("Dairenin cevresi: "+(2*3.14*yariCap));
    }
}
