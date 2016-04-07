package Observer.structcode;

/**
 * Created by fisbii on 16-4-7.
 */
public abstract class Observer {
    protected String name;
    protected Subject sub;

    public Observer(String name,Subject sub){
        this.name = name;
        this.sub = sub;
    }

    public abstract void update();
}
