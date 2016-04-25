package singleton.threadsafe;

/**
 * Created by fisbii on 16-4-25.
 */
public class Singleton {

    private static Singleton instance;
    private Singleton(){

    }
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
