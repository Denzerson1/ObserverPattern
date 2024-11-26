import java.util.ArrayList;
import java.util.List;

public abstract class Object {

    List<Observer> list = new ArrayList<Observer>();

    public void add(Observer O) {
        list.add(O);
    }

    public void delete(Observer O) {
        list.remove(O);
    }

    public void notifyObserver() {
        for(Observer o : list) {
            o.update();
        }
    }
}
