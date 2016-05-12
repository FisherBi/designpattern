package command;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by fisbii on 16-5-12.
 */
public class Waiter {

    private List<Command> orders = new ArrayList<>();

    public void setOrder(Command command){
        orders.add(command);
        System.out.println("增加订单：" + command.toString() + "时间：" + new Date());
    }

    public void cancelOrder(Command command){
        orders.remove(command);
        System.out.println("取消订单：" +command.toString() + "时间：" + new Date());
    }

    public void Notify(){
        for(Command cmd : orders){
            cmd.executeCommand();
        }
    }
}
