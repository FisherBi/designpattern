package mediator.structcode;

/**
 * Created by fisbii on 16-5-16.
 */
public class ConcreteColleague1 extends Colleague{
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message,this);
    }

    public void Notify(String message){
        System.out.println("同事1得到信息：" + message);
    }
}
