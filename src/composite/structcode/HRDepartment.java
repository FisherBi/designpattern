package composite.structcode;

/**
 * Created by fisbii on 16-4-20.
 */
public class HRDepartment extends Company {

    public HRDepartment(String name){
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
        System.out.println(name + "员工招聘培训管理");
    }
}
