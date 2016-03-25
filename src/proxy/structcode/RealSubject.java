package proxy.structcode;

/**
 * Created by fisbii on 16-3-25.
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("真实的请求");
    }
}
