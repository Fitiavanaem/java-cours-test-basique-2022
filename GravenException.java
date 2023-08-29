import java.util.HashMap;
import java.util.Map;

public class GravenException {
    public static void main(String[] args) {
        
        Map<String, Integer> map= new HashMap<>();

        map.put("John", 35);
        map.put("Fitiavana", 23);
        map.put("Bob", 25);

        int moyenne=0; 

        System.out.println(map.toString() + "ans");

        for(Map.Entry<String,Integer> element : map.entrySet()){
            System.out.println(element.getKey() + " : " + element.getValue() + " ans");
            moyenne+=element.getValue();
        }
        System.out.println("Total du ages est : " + moyenne  + " ans");

        moyenne=(moyenne/map.size());
        System.out.println("Donc, la moyenne du ages est : "+ moyenne  + " ans");
    }
}
