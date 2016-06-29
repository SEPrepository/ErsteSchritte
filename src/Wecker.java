import java.util.Random;

/**
 * Created by kastl on 22.06.2016.
 */

public class Wecker {
    private int zahl;
    private String weckersound;

    public Wecker(String weckersound) {
        Random zufall;
        zufall = new Random();
        zahl = zufall.nextInt(10);
        this.weckersound = weckersound;
    }

    public int getZahl() {
        return zahl;
    }

    public void setZahl(int zahl) {
        this.zahl = zahl;
    }

    public String getWeckersound() {
        return weckersound;
    }

    public void setWeckersound(String weckersound) {
        this.weckersound = weckersound;
    }

    public static void main(String[] args) {

        Wecker eieruhr = new Wecker("klingelingeling");
        Wecker eieruhr1 = new Wecker("klingelingeling");
        Wecker eieruhr2 = new Wecker("klingelingeling");
        Wecker eieruhr3 = new Wecker("drpgj");


        for (int i = 0; i < eieruhr.getZahl(); i++) {
            System.out.println(eieruhr.getWeckersound());
            System.out.println(eieruhr1.getWeckersound());
            System.out.println(eieruhr2.getWeckersound());
            System.out.println(eieruhr3.getWeckersound());

        }
    }
}
