package visitor.structcode;

/**
 * Created by fisbii on 16-5-20.
 */
public abstract class Element {
    public abstract void accept(Visitor visitor);
}
