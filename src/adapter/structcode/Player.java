package adapter.structcode;

/**
 * Created by fisbii on 16-4-12.
 */
public abstract class Player {

    protected String name;

    public Player(String name){
        this.name = name;
    }

    public abstract void attack();

    public abstract void defense();
}
