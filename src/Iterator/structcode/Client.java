package Iterator.structcode;

/**
 * Created by fisbii on 16-4-22.
 */
public class Client {

    public static void main(String args[]){
        ConcreteAggregate a = new ConcreteAggregate();
        a.add("大鸟");
        a.add("小菜");
        a.add("行李");
        a.add("老外");
        a.add("公交内部员工");
        a.add("小偷");

        Iterator i = new ConcreteIterator(a);
        Object item = i.first();
        while(!i.isDone()){
            System.out.println(i.currentItem() + "请买车票！");
            i.next();
        }
    }
}
