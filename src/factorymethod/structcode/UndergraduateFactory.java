package factorymethod.structcode;

/**
 * Created by fisbii on 16-3-25.
 */
public class UndergraduateFactory implements IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}
