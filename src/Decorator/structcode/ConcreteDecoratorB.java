package Decorator.structcode;

/**
 * Created by fisbii on 16-3-24.
 */
public class ConcreteDecoratorB extends Decorator {

    public void operation(){
        super.operation();
        AddedBehavior();
        System.out.println("具体的装饰对象B的操作");
    }

    public void AddedBehavior(){

    }
}
