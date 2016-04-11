package abstractfactory.reflect;

import abstractfactory.simplefactory.DataAccess;
import abstractfactory.structcode.Department;
import abstractfactory.structcode.IDepartment;
import abstractfactory.structcode.IUser;
import abstractfactory.structcode.User;

/**
 * Created by fisbii on 16-4-11.
 */
public class Client {
    public static void main(String args[]){
        User user = new User();
        Department dp = new Department();

        IUser iu = abstractfactory.simplefactory.DataAccess.createUser();
        iu.insert(user);
        iu.getUser(1);

        System.out.println();

        IDepartment iDepartment = DataAccess.createDepartment();
        iDepartment.insert(dp);
        iDepartment.getDepartment(1);
    }
}
