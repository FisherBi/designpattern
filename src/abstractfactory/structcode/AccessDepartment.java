package abstractfactory.structcode;

/**
 * Created by fisbii on 16-4-11.
 */
public class AccessDepartment implements IDepartment{
    @Override
    public void insert(Department department) {
        System.out.println("在Access中给Department表插入一条记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在Access中根据ID得到Department表的一条记录");
        return null;
    }
}
