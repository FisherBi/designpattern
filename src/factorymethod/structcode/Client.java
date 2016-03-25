package factorymethod.structcode;

/**
 * Created by fisbii on 16-3-25.
 */
public class Client {
    public static void main(String args[]){
        IFactory factory = new UndergraduateFactory();
        LeiFeng student = factory.createLeiFeng();

        student.buyRice();
        student.sweep();
        student.wash();
    }
}
