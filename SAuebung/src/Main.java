public class Main {

    public static void main(String[] args) {
        Garage garage = new Garage();

        Observer O1 = new KartenApp(garage);
        Observer O2 = new OtherApp(garage);

        garage.addObserver(O1);
        garage.addObserver(O2);

        garage.setAnzahl(30);
        garage.setAnzahl(50);
    }

}
