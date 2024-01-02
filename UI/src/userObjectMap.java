import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class userObjectMap {
    public void addObjectMap(JSONArray jsonArr){
        Map<Integer, userObject> userObjectMap = new HashMap<Integer, userObject>();
        for(int i = 0; i < (int) (jsonArr.length()); ++i){
            userObject tempUserObject = new userObject((JSONObject) jsonArr.getJSONObject(i));
            userObjectMap.put((Integer) tempUserObject.id, tempUserObject);
        }
        System.out.println(userObjectMap);
        System.out.println(userObjectMap.get(124).getName());
    }
}
