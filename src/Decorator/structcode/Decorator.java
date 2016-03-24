package Decorator.structcode;

/**
 * Created by fisbii on 16-3-24.
 */
public class Decorator extends Component {

    protected Component component;

    public void setComponent(Component component){
        this.component = component;
    }

    @Override
    public void operation() {
        if(component != null){
            component.operation();
        }
    }
}
