package Observer.structcode;


/**
 * Created by fisbii on 16-4-7.
 */
public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObserver();
    public String getAction();
    void setAction(String action);
}
