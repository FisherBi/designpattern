package strategy;

/**
 * 打折收费算法
 * Created by fisbii on 16-3-23.
 */
public class CashRebate implements CashSuper {
    private double moneyRebate = 1d;
    public CashRebate(String moneyRebate){
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }
    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
