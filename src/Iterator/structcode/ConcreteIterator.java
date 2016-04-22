package Iterator.structcode;

/**
 * Created by fisbii on 16-4-22.
 */
public class ConcreteIterator extends Iterator {

    private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate concreteAggregate) {
        this.aggregate = concreteAggregate;
    }

    @Override
    public Object first() {
        return aggregate.get(0);
    }

    @Override
    public Object next() {
        Object ret = null;
        current++;
        if(current < aggregate.getCount()){
            ret = aggregate.get(current);
        }
        return ret;
    }

    @Override
    public boolean isDone() {
        return current >= aggregate.getCount() ? true : false;
    }

    @Override
    public Object currentItem() {
        return aggregate.get(current);
    }
}
