package abstractfactory.simplefactory;

import abstractfactory.structcode.*;

/**
 * Created by fisbii on 16-4-11.
 */
public class DataAccess {
    private static final String db = "SqlServer";
    //private static final String db = "Access";

    public static IUser createUser(){
        IUser result = null;
        switch (db){
            case "SqlServer":
                result = new SqlServerUser();
                break;
            case "Access":
                result = new AccessUser();
                break;
        }
        return result;
    }

    public static IDepartment createDepartment(){
        IDepartment result = null;
        switch (db){
            case "SqlServer":
                result = new SqlServerDepartment();
                break;
            case "Access":
                result = new AccessDepartment();
                break;
        }
        return result;
    }
}
