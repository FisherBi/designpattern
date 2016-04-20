package composite.structcode;

/**
 * Created by fisbii on 16-4-20.
 */
public abstract class Company {
    protected String name;

    public Company(String name){
        this.name = name;
    }

    public abstract void add(Company c);
    public abstract void remove(Company c);
    public abstract void display(int depth);
    public abstract void LineOfDuty();
}
