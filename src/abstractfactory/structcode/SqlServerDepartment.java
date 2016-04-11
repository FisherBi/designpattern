package abstractfactory.structcode;

/**
 * Created by fisbii on 16-4-11.
 */
public class SqlServerDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在SQL Server中给Department增加一条记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在SQL Server中根据ID得到Department表一条记录");
        return null;
    }
}
