package composite.structcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fisbii on 16-4-20.
 */
public class ConcreteCompany extends Company {

    private List<Company> children = new ArrayList<>();

    public ConcreteCompany(String name){
        super(name);
    }

    @Override
    public void add(Company c) {
        children.add(c);
    }

    @Override
    public void remove(Company c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        System.out.println(new PrintName("-",depth) + name);
        for(Company c : children){
            c.display(depth+2);
        }
    }

    @Override
    public void LineOfDuty() {
        for(Company c : children){
            c.LineOfDuty();
        }
    }
}
