package abstractfactory.structcode;

/**
 * Created by fisbii on 16-4-11.
 */
public class Client {
    public static void main(String args[]){
        User user = new User();
        Department department = new Department();
        IFactory factory = new SqlServerFactory();
        IUser iu = factory.CreateUser();
        iu.insert(user);
        iu.getUser(1);

        System.out.println();

        IDepartment iDepartment = factory.createDepartment();
        iDepartment.insert(department);
        iDepartment.getDepartment(1);
    }
}
