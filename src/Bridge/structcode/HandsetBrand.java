package Bridge.structcode;

/**
 * Created by fisbii on 16-5-4.
 */

/**
 * 手机品牌类
 */
public abstract class HandsetBrand {
    protected HandsetSoft soft;

    public void setHandsetSoft(HandsetSoft soft){
        this.soft = soft;
    }

    public abstract void run();
}
