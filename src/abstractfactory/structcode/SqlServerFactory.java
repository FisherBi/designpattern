package abstractfactory.structcode;

/**
 * Created by fisbii on 16-4-11.
 */
public class SqlServerFactory implements IFactory {
    @Override
    public IUser CreateUser() {
        return new SqlServerUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlServerDepartment();
    }
}
