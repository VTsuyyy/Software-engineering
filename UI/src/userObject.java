import org.json.JSONObject;

class userObject{
    int id;
    String name;
    String email;
    public userObject(JSONObject obj){
        this.id = obj.getInt("id");
        this.name = obj.getString("name");
        this.email = obj.getString("email");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

}