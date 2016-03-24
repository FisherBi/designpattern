package Test;

/**
 * Created by fisbii on 16-3-24.
 */
public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("狗吃饭");
    }

    @Override
    public void run() {
        System.out.println("狗跑");
    }

    public void pee(){
        System.out.println("狗撒尿");
    }
}
