package strategy;

/**
 * Created by fisbii on 16-3-23.
 */
public class TestCash {
    public static void main(String args[]){
        CashContext cashContext = new CashContext("打8折");
        double totalPrice = 0;
        totalPrice = cashContext.getResult(5 * 12.5);
        System.out.println("总价为：" + totalPrice);
    }
}
