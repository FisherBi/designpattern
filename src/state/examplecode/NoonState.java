package state.examplecode;

/**
 * Created by fisbii on 16-4-21.
 */
public class NoonState extends State {
    @Override
    public void writeProgram(Work w) {
        if(w.getHour() < 13){
            System.out.println("当前时间：" + w.getHour() + "点，饿了，午饭；犯困，午休。");
        }else {
            w.setState(new AfternoonState());
            w.writeProgram();
        }
    }
}
