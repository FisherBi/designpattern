package command;

/**
 * Created by fisbii on 16-5-12.
 */
public class BakeChickenWingCommand extends Command {

    public BakeChickenWingCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.BakeChickenWing();
    }
}
