package Iterator.structcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fisbii on 16-4-22.
 */
public class ConcreteAggregate extends Aggregate {

    private List<Object> items = new ArrayList<>();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int getCount(){
        return items.size();
    }

    public void add(Object o){
        items.add(o);
    }

    public Object get(int index){
        return items.get(index);
    }
}
