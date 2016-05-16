package mediator.structcode;

/**
 * Created by fisbii on 16-5-16.
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }
}
