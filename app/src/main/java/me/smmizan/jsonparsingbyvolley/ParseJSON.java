package me.smmizan.jsonparsingbyvolley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Mizan on 20/09/2018.
 */

public class ParseJSON {

    public static String[] id;
    public static String[] name;
    public static String[] mail;
    public static String[] address;

    public static final String JSON_ARRAY = "result";
    public static final String KEY_ID = "id";
    public static final String KEY_NAME = "name";
    public static final String KEY_MAIL = "email";
   // public static final String KEY_ADDRESS = "address";

    private JSONArray users = null;

    private String json;

    public ParseJSON(String json){
        this.json = json;
    }

    protected void parseJSON(){
        JSONObject jsonObject=null;
        try {
            jsonObject = new JSONObject(json);
            users = jsonObject.getJSONArray(JSON_ARRAY);

            id = new String[users.length()];
            name = new String[users.length()];
            mail = new String[users.length()];
         //   address = new String[users.length()];

            for(int i=0;i<users.length();i++){
                JSONObject myjsonObject = users.getJSONObject(i);
                id[i] = myjsonObject.getString(KEY_ID);
                name[i] = myjsonObject.getString(KEY_NAME);
                mail[i] = myjsonObject.getString(KEY_MAIL);
             //   address[i] = myjsonObject.getString(KEY_ADDRESS);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


}
