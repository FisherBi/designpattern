package builder.examplecode;

/**
 * Created by fisbii on 16-3-30.
 */
public class Client {
    public static void main(String args[]){
        Pen pen = new Pen("黄色");
        PersonThinBuilder ptb = new PersonThinBuilder(new Graphics(),pen);
        PersonDirector pdThin = new PersonDirector(ptb);
        pdThin.CreatePerson();
    }
}
