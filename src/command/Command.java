package command;

/**
 * Created by fisbii on 16-5-12.
 */
public abstract class Command {
    protected Barbecuer receiver;

    public Command(Barbecuer receiver){
        this.receiver = receiver;
    }

    abstract public void executeCommand();
}
