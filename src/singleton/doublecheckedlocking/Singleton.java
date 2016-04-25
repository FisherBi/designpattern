package singleton.doublecheckedlocking;

/**
 * Created by fisbii on 16-4-25.
 */
public class Singleton {
    private volatile static Singleton instance;
    private Singleton (){}
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
