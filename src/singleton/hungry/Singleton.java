package singleton.hungry;

/**
 * Created by fisbii on 16-4-25.
 */
public class Singleton {
    private Singleton() {}
    private static final Singleton single = new Singleton();
    //静态工厂方法
    public static Singleton getInstance() {
        return single;
    }
}
