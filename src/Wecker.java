import java.util.Random;

/**
 * Created by kastl on 22.06.2016.
 */

public class Wecker {
    private int zahl;
    private String weckersound;
    private static int anzMinuten;

    public Wecker(String weckersound) {
        Random zufall;
        zufall = new Random();
        zahl = zufall.nextInt(10);
        this.weckersound = weckersound;
        anzMinuten=zufall.nextInt(7);
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

    public int getAnzMinuten() {
        return anzMinuten;
    }

    public void setAnzMinuten(int anzMinuten) {
        this.anzMinuten = anzMinuten;
    }

    public void setWeckersound(String weckersound) {
        this.weckersound = weckersound;
    }

    public static void main(String[] args) {

        Wecker eieruhr = new Wecker("klingelingeling");



        for (int i = 0; i < eieruhr.getZahl(); i++) {
            System.out.println(eieruhr.getWeckersound());
            if((anzMinuten > 0) && ((anzMinuten % 2) == 0)) {
                eieruhr.setWeckersound(eieruhr.getWeckersound() + "ringeding");
                anzMinuten--;
            }
            else {
                if ((anzMinuten > 0) && ((anzMinuten % 2) == 1)) {
                    eieruhr.setWeckersound(eieruhr.getWeckersound() + "bimelimelim");
                    anzMinuten--;
                }
            }
        }
        }
    }

