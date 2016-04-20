package composite.structcode;

/**
 * Created by fisbii on 16-4-20.
 */
public class FinanceDepartment extends Company {

    public FinanceDepartment(String name){
        super(name);
    }

    @Override
    public void add(Company c) {

    }

    @Override
    public void remove(Company c) {

    }

    @Override
    public void display(int depth) {
        System.out.println(new PrintName("-",depth) + name);
    }

    @Override
    public void LineOfDuty() {
        System.out.println(name + "公司财务收支管理");
    }
}
