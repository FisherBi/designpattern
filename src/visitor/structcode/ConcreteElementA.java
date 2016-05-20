package visitor.structcode;

/**
 * Created by fisbii on 16-5-20.
 */
public class ConcreteElementA extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }

    //相关其他方法
    public void operationA(){}
}
