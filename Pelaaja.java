/**
 * Luokka mallintaa yhtä jääkiekon pelaajaa.
 * Pelaajalla on nimen ja numeron lisäksi tieto tehdyistä
 * maaleista ja annetuista syötöistä.
 */
public class Pelaaja {
    private String nimi;
    private int pelinumero;
    private int maalit;
    private int syotot;

    /**
     * Konstruktori luo uuden Pelaaja-olion
     *
     * @param nimi pelaajan nimi
     * @param pelinumero pelaajan pelinumero
     * @param maalit pelaajan maalien määrä
     * @param syotot pelaajan syöttöjen määrä
     *
     */
    public Pelaaja(String nimi, int pelinumero, int maalit, int syotot) {
        this.nimi = nimi;
        this.pelinumero = pelinumero;
        this.maalit = maalit;
        this.syotot = syotot;
    }
    /**
     * Konstruktori luo uuden Pelaaja-olion. Pelaajan maalien ja
     * syöttöjen määräksi tulee 0.
     *
     * @param nimi pelaajan nimi
     * @param pelinumero pelaajan pelinumero
     *
     */
    public Pelaaja(String nimi, int pelinumero) {
        this.nimi = nimi;
        this.pelinumero = pelinumero;
        maalit = 0;
        syotot = 0;
    }

    /**
     * Metodi palauttaa pelaajan nimen
     * @return pelaajan nimen
     */
    public String getNimi() {
        return nimi;
    }
    /**
     * Metodi palauttaa pelaajan pelinumeron
     * @return pelaajan pelinumeron
     */
    public int getPelinumero() {
        return pelinumero;
    }
    /**
     * Metodi lisää pelaajalle yhden tehdyn maalin
     */
    public void setMaalit(int maalit) {
        this.maalit = maalit+1;
    }

    /**
     * Metodi lisää pelaajalle yhden syötön
     */
    public void setSyotot(int syotot) {
        this.syotot = syotot+1;
    }
    /**
     * Palauttaa pelaajan pisteiden määrän. Pisteisiin lasketaan
     * yhteen sekä maalit että syötöt.
     *
     * @return tiedon pelaajan pisteistä
     */
    public int getPisteet(int syotot, int maalit) {
        int pisteet = syotot+maalit;
        return (pisteet);
    }
    /**
     * Palauttaa pelaajan tiedot merkkijonona alla olevan esimerkin
     * mukaisesti. Esimerkissä pelaajan nimi on "Pekka Pelaaja", hänen
     * pelinumeronsa on 8 ja hänellä on 1 maali ja 3 syöttöä.
     *
     * 8. Pekka Pelaaja (1 + 3 = 4)
     */

    public String getPelaajaInfo() {
        int pisteet = getPisteet(syotot, maalit);
        return pelinumero +". "+ nimi + " (" + maalit + " + " + syotot + " =  " + pisteet + ")";
    }
}