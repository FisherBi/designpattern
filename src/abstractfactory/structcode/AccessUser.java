package abstractfactory.structcode;

/**
 * Created by fisbii on 16-4-11.
 */
public class AccessUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("在Access中给User表增加一条记录");
    }

    @Override
    public User getUser(int id) {
        System.out.printf("在Access中根据ID得到User表一条记录");
        return null;
    }
}
