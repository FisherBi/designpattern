package builder.examplecode;

/**
 * Created by fisbii on 16-3-30.
 */
public class Pen {

    private String color;

    public Pen(String color){
        this.color = color;
        System.out.println(color + "的笔");
    }

    public String getColor(){
        return color;
    }
}
