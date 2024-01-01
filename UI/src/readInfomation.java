import org.json.JSONArray;
import org.json.JSONException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class readInfomation {
    public JSONArray getData(){
        try {
            // Replace this URL with the actual endpoint you want to call
            String apiUrl = "http://localhost:8080/users";

            // Create a URL object with the API endpoint
            URL url = new URL(apiUrl);

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the request method to GET
            connection.setRequestMethod("GET");

            // Get the response code
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            // Read the response from the server
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();

            int ab = 0;
            while ((line = reader.readLine()) != null) {
                System.out.println(line + "\n");
                response.append(line);
                System.out.println(ab + "\n");
            }

            // Close the connection and the reader
            reader.close();
            connection.disconnect();

            // Print the response
            System.out.println("Response: " + response.toString());
//            try {
                System.out.println(response);
                JSONArray jsonArr = new JSONArray(response.toString());
                System.out.println(jsonArr.getJSONObject(1).get("id"));
                return jsonArr;
//            }catch (JSONException err){
//                System.out.println("Error" + err.toString());
//            }
        } catch (Exception e) {
            e.printStackTrace();
            JSONArray jsonArr = new JSONArray();
            return jsonArr;
        }
    }
}