package visitor.structcode;

/**
 * Created by fisbii on 16-5-20.
 */
public class ConcreteVisitor2 extends Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(concreteElementA+"被"+this+"访问");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(concreteElementB+"被"+this+"访问");
    }
}
