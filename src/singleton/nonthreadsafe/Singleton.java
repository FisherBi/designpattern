package singleton.nonthreadsafe;

/**
 * Created by fisbii on 16-4-25.
 * 懒汉式，非线程安全
 */
public class Singleton {
    private static Singleton instance;

    private Singleton(){
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
