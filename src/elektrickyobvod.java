public class elektrickyobvod {
    float napetiZdroje;
    float elektrickyOdpor;

    public elektrickyobvod(float napetiZdroje, float elektrickyOdpor){
        this.elektrickyOdpor = elektrickyOdpor;
        this.napetiZdroje = napetiZdroje;
    }
    public float elektrickyProud(float pocetCastic, float cas){
        return pocetCastic/cas;
    }
    public float zmenaOdporu(float elektrickyOdpor, float novyElektrickyOdpor){
        this.elektrickyOdpor = elektrickyOdpor;
        return elektrickyOdpor-novyElektrickyOdpor;
    }
    public float elektrickyVykon(float napetiZdroje, float pocetCastic, float cas){
        return napetiZdroje*pocetCastic*cas;
    }
    public float getNapetiZdroje() {
        return napetiZdroje;
    }

    public void setNapetiZdroje(float napetiZdroje) {
        this.napetiZdroje = napetiZdroje;
    }

    public float getElektrickyOdpor() {
        return elektrickyOdpor;
    }

    public void setElektrickyOdpor(float elektrickyOdpor) {
        this.elektrickyOdpor = elektrickyOdpor;
    }
}
