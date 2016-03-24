package Test;

/**
 * Created by fisbii on 16-3-24.
 */
public class Person implements Animal {
    @Override
    public void eat() {
        System.out.println("人吃饭");
    }

    @Override
    public void run() {
        System.out.println("人跑步");
    }

    public void think(){
        System.out.println("人思考");
    }
}
