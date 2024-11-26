public class OtherApp implements Observer {

    Garage garage;

    public OtherApp(Garage garage) {
        this.garage = garage;
    }

    public void update() {
        anzeige();
    }

    @Override
    public void anzeige() {
        int anzahl = garage.getAnzahl();
        System.out.println("OtherApp: " + anzahl);
    }
}
