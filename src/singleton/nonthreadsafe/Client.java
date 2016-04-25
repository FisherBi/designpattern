package singleton.nonthreadsafe;

/**
 * Created by fisbii on 16-4-25.
 */
public class Client {

    public static void main(String args[]){
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if(s1 == s2){
            System.out.println("两个对象是相同实例。");
        }
    }
}
