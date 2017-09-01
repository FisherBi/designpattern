package simplefactory.refactorIF;

import java.util.List;

/**
 * Created by fisbii on 17-9-1.
 */
public class CountRecoder {
    public void setCountOfFirstStage(int code){
        System.out.println("setCountOfFirstStage");
    }
    public void setCountOfSecondStage(int code){
        System.out.println("setCountOfSecondStage");
    }
    public void setCountOfThirdtage(int code){
        System.out.println("setCountOfThirdtage");
    }
    public void setCountOfForthtage(int code){
        System.out.println("setCountOfForthtage");
    }
    public void setCountOfFirthStage(int code){
        System.out.println("setCountOfFirthStage");
    }
    public void setCountOfSixthStage(int code){
        System.out.println("setCountOfSixthStage");
    }

    public CountRecoder getCountRecoder(List<CountEntry> countEntries) {
        CountRecoder countRecoder = new CountRecoder();
        countEntries.stream().forEach(countEntry ->
                FillCountServieFactory.getFillCountStrategy(countEntry.getCode())
                        .fillCount(countRecoder, countEntry.getCount()));
        return countRecoder;
    }

}
