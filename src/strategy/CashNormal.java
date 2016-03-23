package strategy;

/**
 * 正常收银算法
 * Created by fisbii on 16-3-23.
 */
public class CashNormal implements CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
