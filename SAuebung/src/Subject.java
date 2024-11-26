import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Observer> list;

    public Subject() {
        list = new ArrayList<Observer>();
    }

    public void addObserver(Observer o) {
        list.add(o);
    }

    public void removeObserver(Observer o) {
        list.remove(o);
    }

    public void notifyObserver() {
        for(Observer o : list) {
            o.update();
        }
    }

}
