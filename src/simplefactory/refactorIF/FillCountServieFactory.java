package simplefactory.refactorIF;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fisbii on 17-9-1.
 */
public class FillCountServieFactory {
    private static Map<Integer, FillCountService> fillCountServiceMap = new HashMap<>();

    static {
        fillCountServiceMap.put(1, new FillCountService() {
            @Override
            public void fillCount(CountRecoder countRecoder, int count) {
                countRecoder.setCountOfFirstStage(count);
            }
        });
        fillCountServiceMap.put(2, (countRecoder, count) -> countRecoder.setCountOfSecondStage(count));
        fillCountServiceMap.put(3, (countRecoder, count) -> countRecoder.setCountOfThirdtage(count));
        fillCountServiceMap.put(4, (countRecoder, count) -> countRecoder.setCountOfForthtage(count));
        fillCountServiceMap.put(5, (countRecoder, count) -> countRecoder.setCountOfFirthStage(count));
        fillCountServiceMap.put(6, (countRecoder, count) -> countRecoder.setCountOfSixthStage(count));
    }

    public static FillCountService getFillCountStrategy(int statusCode) {
        return fillCountServiceMap.get(statusCode);
    }
}
