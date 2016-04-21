package state.examplecode;

/**
 * Created by fisbii on 16-4-21.
 */
public class SleepingState extends State {
    @Override
    public void writeProgram(Work w) {
        System.out.println("当前时间：" + w.getHour() + "点不行了，睡着了。");
    }
}
