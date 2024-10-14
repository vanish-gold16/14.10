public class Bankomat {
    String adresa;
    String ulice;
    int hotovost;
    int castka;

    public void Vyber(int hotovost, int castka){
        this.hotovost = hotovost;
        this.castka = castka;
        if(hotovost >= castka){
            System.out.println("Penez je dost");
            setHotovost(hotovost-castka);
        }
        else
            System.out.println("Nestaci penez");
    }

    public Bankomat(String adresa, int hotovost, String ulice, int castka) {
        this.adresa = adresa;
        this.hotovost = hotovost;
        this.ulice = ulice;
        this.castka = castka;
    }

    public String getUlice() {
        return ulice;
    }

    public void setUlice(String ulice) {
        this.ulice = ulice;
    }

    public int getCastka() {
        return castka;
    }

    public void setCastka(int castka) {
        this.castka = castka;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getHotovost() {
        return hotovost;
    }

    public void setHotovost(int hotovost) {
        this.hotovost = hotovost;
    }
}
