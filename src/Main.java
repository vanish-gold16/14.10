public class Main {
    public static void main(String[] args) {
        Pocitac Asus = new Pocitac("Asus", 15000, "Intel");
        Pocitac Mac = new Pocitac("Apple", 30000, "Apple M4");

        System.out.println(Asus);
        System.out.println(Mac);

        System.out.println("***********************************");

        elektrickyobvod elektrickyobvod = new elektrickyobvod(20000, 20f);

        System.out.println("Elektricky proud je " + elektrickyobvod.elektrickyProud(10000, 100));
        System.out.println("Elektricky vykon je " + elektrickyobvod.elektrickyVykon(20000, 10000, 100));

        elektrickyobvod.zmenaOdporu(20f, 10f);


        System.out.println("***********************************");

        Zvire pes = new Zvire("pes", "savec", 20, 10);
        Zvire medved = new Zvire("medved", "savec", 600, 100);

        System.out.println(pes);
        System.out.println(medved);
        System.out.println(pes.naklad(pes.vaha, pes.spotrebaKrmiva)+medved.naklad(medved.vaha, medved.spotrebaKrmiva));

        System.out.println("***********************************");

        Bankomat bankomat = new Bankomat("Praha", 50000, "Jecna", 1000);

        bankomat.Vyber(bankomat.hotovost, bankomat.castka);

        bankomat.setCastka(5000);

        bankomat.Vyber(bankomat.hotovost, bankomat.castka);
        System.out.println("Zustatek" + bankomat.hotovost);

        System.out.println("***********************************");


    }
}