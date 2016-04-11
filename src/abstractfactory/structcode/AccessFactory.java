package abstractfactory.structcode;

/**
 * Created by fisbii on 16-4-11.
 */
public class AccessFactory implements IFactory {
    @Override
    public IUser CreateUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new AccessDepartment();
    }
}
