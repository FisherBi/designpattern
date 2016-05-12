package command;

/**
 * Created by fisbii on 16-5-12.
 */
public class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.BakeMutton();
    }
}
