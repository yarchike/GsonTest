import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.Map;

public class GsonTest {

    public static void saveMap(Map<String,Integer> map){
        try {
            FileWriter writer = new FileWriter("map.json", false);
            Gson gson = new Gson();
            String v = gson.toJson(map);
            System.out.println(v);
            writer.write(v);
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
   }
   public static Map<String,Integer> readMap(){
       String json ="";
       try {
           FileReader reader = new FileReader("map.json");
           int c;
           while((c=reader.read())!=-1){
               json+= (char)c;
           }

       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
       Type type = new TypeToken<Map<String, Integer>>(){}.getType();
       return new Gson().fromJson(json, type);
   }



}
