package abstractfactory.structcode;

/**
 * Created by fisbii on 16-4-11.
 */
public interface IFactory {
    IUser CreateUser();
    IDepartment createDepartment();
}
