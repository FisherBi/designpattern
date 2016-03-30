package builder.examplecode;

/**
 * 指挥者类，用来控制建造过程，也用来隔离用户与建造过程的关联
 * Created by fisbii on 16-3-30.
 */
public class PersonDirector {
    private PersonBuilder pb;

    public PersonDirector(PersonBuilder pb){
        this.pb = pb;
    }

    public void CreatePerson(){
        pb.buildHead();
        pb.buildBody();
        pb.buildArmLeft();
        pb.buildArmRight();
        pb.buildLegLeft();
        pb.buildLegRight();
    }
}
