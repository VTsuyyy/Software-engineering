package Manager;

import org.json.JSONObject;

public class ProductObject {
    int id;
    String name;
    Boolean available;
    int cost;
    int discount;

    public ProductObject(JSONObject obj){
        this.id = obj.getInt("id");
        this.name = obj.getString("name");
        this.available = obj.getBoolean("available");
        this.cost = obj.getInt("cost");
        this.discount = obj.getInt("discount");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Boolean getAvailable() {
        return available;
    }

    public int getCost() {
        return cost;
    }

    public int getDiscount() {
        return discount;
    }
}
