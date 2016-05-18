package flyweight.structcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fisbii on 16-5-18.
 */
public class WebSiteFactory {
    private Map flyWeights = new HashMap();

    public WebSite getWebSiteCategory(String key){
        if(!flyWeights.containsKey(key)){
            flyWeights.put(key,new ConcreteWebSite(key));
        }
        return (WebSite)flyWeights.get(key);
    }

    public int getWebSiteCount(){
        return flyWeights.size();
    }
}
