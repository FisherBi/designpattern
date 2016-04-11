package abstractfactory.reflect;

import abstractfactory.structcode.*;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by fisbii on 16-4-11.
 */
public class DataAccess {
    private static final String assemblyName = "abstractfactory.structcode";
    private static final String db = "SqlServer";
    //private static final String db = "Access";

    public static IUser createUser() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String className = assemblyName + "." + db + "User";
        return (IUser) Class.forName(className).getConstructor().newInstance();
    }

    public static IDepartment createDepartment() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String className = assemblyName + "." + db + "Department";
        return (IDepartment) Class.forName(className).getConstructor().newInstance();
    }
}
