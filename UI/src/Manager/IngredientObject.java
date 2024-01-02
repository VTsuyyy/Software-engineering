package Manager;

import org.json.JSONObject;

public class IngredientObject {
    int id;
    String name;
    String unit;
    int unit_price;
    public IngredientObject(JSONObject obj){
        this.id = obj.getInt("id");
        this.name = obj.getString("name");
        this.unit = obj.getString(("unit"));
        this.unit_price = obj.getInt("unit_price");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public int getUnit_price() {
        return unit_price;
    }
}
