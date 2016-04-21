package state.examplecode;

/**
 * Created by fisbii on 16-4-21.
 */
public class ForenoonState extends State {
    @Override
    public void writeProgram(Work w) {
        if(w.getHour() < 12){
            System.out.println("当前时间：" + w.getHour() + "点，上午工作，精神百倍");
        }else{
            w.setState(new NoonState());
            w.writeProgram();
        }
    }
}
