import java.util.HashMap;
import java.util.Map;

public class Tabmap {
    public static void main(String[] args) {
        Map<String,Integer> map =new HashMap<String,Integer>();

        map.put("John", 20);
        map.put("Olivia", 80);
        map.put("John", 30);
      
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            printMap(entry);
        }
    }
    public static void printMap(Map.Entry entry){
        System.out.println(entry.getKey()+"->"+entry.getValue());
    }
}