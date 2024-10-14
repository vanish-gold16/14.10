public class Koule {
    float polomer;

    public Koule(float polomer) {
        this.polomer = polomer;
    }
    public double prumer(float polomer){  //prumer
        this.polomer = polomer;
        return polomer*2;
    }
    public double objem(float polomer){
        this.polomer = polomer;
        return (Math.PI*4*polomer*polomer*polomer)/3;
    }
    public double getPolomer() {
        return polomer;
    }

    public void setPolomer(float  polomer) {
        this.polomer = polomer;
    }
}
