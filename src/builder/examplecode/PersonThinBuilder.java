package builder.examplecode;

/**
 * Created by fisbii on 16-3-30.
 */
public class PersonThinBuilder extends PersonBuilder {

    public PersonThinBuilder(Graphics g,Pen p){
        super(g,p);
    }

    @Override
    public void buildHead() {
        g.drawEllipse(p,50,20,30,30);
    }

    @Override
    public void buildBody() {
        g.drawRectangle(p,60,50,10,50);
    }

    @Override
    public void buildArmLeft() {
        g.drawLine(p,60,50,40,100);
    }

    @Override
    public void buildArmRight() {
        g.drawLine(p,70,50,90,100);
    }

    @Override
    public void buildLegLeft() {
        g.drawLine(p,60,100,45,150);
    }

    @Override
    public void buildLegRight() {
        g.drawLine(p,70,100,85,150);
    }
}
