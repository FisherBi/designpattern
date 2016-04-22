package Iterator.structcode;

/**
 * Created by fisbii on 16-4-22.
 */
public abstract class Iterator {

    public abstract Object first();
    public abstract Object next();
    public abstract boolean isDone();
    public abstract Object currentItem();
}
