package composite.structcode;

/**
 * Created by fisbii on 16-4-20.
 */
public class PrintName {
    private String symbol;
    public PrintName(String symbol,int depth){
        this.symbol = symbol;
        for(int i = 0; i < depth; i++){
            this.symbol += symbol;
        }
    }

    @Override
    public String toString() {
        return this.symbol;
    }
}
