import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    static Map<String, Integer> map = new TreeMap<>();
    public static void main(String[] args) {
        map = GsonTest.readMap();

        System.out.println(map.get("Женя"));





//
//        map.put("Данилка", 19);
//        map.put("Ярослав", 29);
//        map.put("Женя", 25);
//        GsonTest.saveMap(map);


    }


}
