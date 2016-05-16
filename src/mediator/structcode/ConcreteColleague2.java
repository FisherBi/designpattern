package mediator.structcode;

/**
 * Created by fisbii on 16-5-16.
 */
public class ConcreteColleague2 extends Colleague{
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message,this);
    }

    public void Notify(String message){
        System.out.println("同事2得到信息：" + message);
    }

}
