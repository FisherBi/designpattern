package singleton.staticclass;

/**
 * Created by fisbii on 16-4-25.
 * 既实现了线程安全，又避免了同步带来的性能影响。
 */
public class Singleton {
    private static class LazyHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    private Singleton (){}
    public static final Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}
