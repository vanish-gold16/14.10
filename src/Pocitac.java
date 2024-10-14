public class Pocitac {
    private String znacka;
    private int cena;
    private String procesor;

    public Pocitac(String znacka, int cena, String procesor){
        this.znacka = znacka;
        this.cena = cena;
        this.procesor = procesor;
    }
    public Pocitac(){

    }

    @Override
    public String toString() {
        return "Pocitac ma " +
                "znacku " + znacka +
                ", cenu " + cena +
                ", procesor " + procesor +
                ' ';
    }

    public void setZnacka(String znacka){
        this.znacka = znacka;
    }
    public String getZnacka(){
        return znacka;
    }
    public void setCena(int cena){
        this.cena = cena;
    }
    public int getCena(){
        return cena;
    }
    public void setProcesor(String procesor){
        this.procesor = procesor;
    }
    public String getProcesor(){
        return procesor;
    }
}
