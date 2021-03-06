package visitor.structcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fisbii on 16-5-20.
 */
public class ObjectStructure {
    private List<Element> elements = new ArrayList<>();

    public void attach(Element element){
        elements.add(element);
    }

    public void detach(Element element){
        elements.remove(element);
    }

    public void accept(Visitor visitor){
        for(Element e : elements){
            e.accept(visitor);
        }
    }
}
