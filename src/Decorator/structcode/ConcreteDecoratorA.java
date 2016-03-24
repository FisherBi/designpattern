package Decorator.structcode;

/**
 * Created by fisbii on 16-3-24.
 */
public class ConcreteDecoratorA extends Decorator {
    private String addedState;

    public void operation(){
        super.operation();
        addedState = "New State";
        System.out.println("具体装饰对象A的操作");
    }
}
