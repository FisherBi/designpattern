package proxy.structcode;

/**
 * Created by fisbii on 16-3-25.
 */
public class Proxy implements Subject {

    RealSubject realSubject;

    @Override
    public void request() {
        if(realSubject == null){
            realSubject = new RealSubject();
            System.out.println("begin proxy");
        }
        realSubject.request();
        System.out.println("end proxy");
    }
}
