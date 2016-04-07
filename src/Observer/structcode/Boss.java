package Observer.structcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fisbii on 16-4-7.
 */
public class Boss implements Subject{

    private List<Observer> observers = new ArrayList<>();
    private String action;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer o : observers){
            o.update();
        }
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
