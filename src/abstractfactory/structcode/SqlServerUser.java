package abstractfactory.structcode;

/**
 * Created by fisbii on 16-4-11.
 */
public class SqlServerUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("在SQL Server中给User表增加一条记录");
    }

    @Override
    public User getUser(int id) {
        System.out.printf("在SQL Server中根据ID得到User表一条记录");
        return null;
    }
}
