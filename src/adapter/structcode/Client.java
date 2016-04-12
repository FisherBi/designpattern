package adapter.structcode;

/**
 * Created by fisbii on 16-4-12.
 */
public class Client {
    public static void main(String args[]){
        Player b = new Forward("巴蒂尔");
        b.attack();

        Player ym = new Translator("姚明");
        ym.attack();
        ym.defense();
    }
}
