package strategy;

/**
 * 用来维护对Strategy对象的引用
 * Created by fisbii on 16-3-23.
 */
public class CashContext {

    private CashSuper cs = null;

    public CashContext(String type){
        switch (type){
            case "正常收费":
                CashNormal cashNormal = new CashNormal();
                cs = cashNormal;
                break;
            case "满300返100":
                CashReturn cashReturn = new CashReturn("300","100");
                cs = cashReturn;
                break;
            case "打8折":
                CashRebate cashRebate = new CashRebate("0.8");
                cs = cashRebate;
                break;
        }
    }

    public double getResult(double money){
        return cs.acceptCash(money);
    }
}
