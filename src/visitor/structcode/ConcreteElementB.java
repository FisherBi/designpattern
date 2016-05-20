package visitor.structcode;

/**
 * Created by fisbii on 16-5-20.
 */
public class ConcreteElementB extends Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }

    public void operationB(){}
}
