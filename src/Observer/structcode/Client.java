package Observer.structcode;

/**
 * Created by fisbii on 16-4-7.
 */
public class Client {
    public static void main(String args[]){
        Boss huhansan = new Boss();
        StockObserver tongshi1 = new StockObserver("aaa",huhansan);
        huhansan.attach(tongshi1);
        huhansan.setAction("我胡汉三回来了");
        huhansan.notifyObserver();
    }
}
