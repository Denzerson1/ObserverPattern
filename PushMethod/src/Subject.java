import java.util.ArrayList;
import java.util.List;

public class Subject {

    List<Observer> list = new ArrayList<Observer>();

    public void add(Observer o) {
        list.add(o);
    }

    public void remove(Observer o) {
        list.remove(o);
    }

    public void notifyObserver(String txt) {
        for(Observer o : list) {
            o.update(txt);
        }
    }

}
