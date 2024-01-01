import org.json.*;

import java.util.HashMap;
import  java.util.Map;
import java.util.List;

public class main {

    public static void main(String[] args) {
        readInfomation st = new readInfomation();
        JSONArray jsonArr = st.getData();
        Map<Integer, userObject> userObjectMap = new HashMap<Integer, userObject>();
        for(int i = 0; i < (int) (jsonArr.length()); ++i){
            userObject tempUserObject = new userObject((JSONObject) jsonArr.getJSONObject(i));
            userObjectMap.put(tempUserObject.id, tempUserObject);
        }
        System.out.println(userObjectMap[(Integer) 124]);
    }
}
