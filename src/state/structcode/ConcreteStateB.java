package state.structcode;

/**
 * Created by fisbii on 16-4-12.
 */
public class ConcreteStateB extends State {
    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateA());
    }
}
