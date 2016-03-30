package builder.examplecode;

/**
 * Created by fisbii on 16-3-30.
 */
public class Graphics {

    public void drawEllipse(Pen p,int a,int b,int c,int d){
        System.out.println("用" + p.getColor() + "的笔画椭圆");
        System.out.println("坐标分别是：" + a + ", " + b + ", " + c + ", " + d);
    }

    public void drawLine(Pen p,int a,int b,int c,int d){
        System.out.println("用" + p.getColor() + "的笔画直线");
        System.out.println("坐标分别是：" + a + ", " + b + ", " + c + ", " + d);
    }

    public void drawRectangle(Pen p,int a,int b,int c,int d){
        System.out.println("用" + p.getColor() + "的笔画矩形");
        System.out.println("坐标分别是：" + a + ", " + b + ", " + c + ", " + d);
    }
}
