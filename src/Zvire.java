public class Zvire {
    String jmeno;
    String druh;
    int vaha;
    int spotrebaKrmiva;

    public Zvire(String jmeno, String druh, int vaha, int spotrebaKrmiva){
        this.jmeno = jmeno;
        this.druh = druh;
        this.vaha = vaha;
        this.spotrebaKrmiva = spotrebaKrmiva;
    }

    public int naklad(int vaha, int spotrebaKrmiva){
        this.vaha = vaha;
        this.spotrebaKrmiva = spotrebaKrmiva;
        return vaha+spotrebaKrmiva*100;
    }

    @Override
    public String toString() {
        return "Zvire " + jmeno +
                ", druh - " + druh +
                ", vaha = " + vaha +
                ", spotrebaKrmiva je " + spotrebaKrmiva;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getDruh() {
        return druh;
    }

    public void setDruh(String druh) {
        this.druh = druh;
    }

    public double getVaha() {
        return vaha;
    }

    public void setVaha(int vaha) {
        this.vaha = vaha;
    }

    public int getSpotrebaKrmiva() {
        return spotrebaKrmiva;
    }

    public void setSpotrebaKrmiva(int spotrebaKrmiva) {
        this.spotrebaKrmiva = spotrebaKrmiva;
    }
}
