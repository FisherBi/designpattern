package state.examplecode;

/**
 * Created by fisbii on 16-4-21.
 */
public class Work {

    private State current;
    private double hour;
    private boolean finish = false;

    public Work(){
        current = new ForenoonState();

    }

    public void setState(State s){
        current = s;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public void writeProgram(){
        current.writeProgram(this);
    }
}
