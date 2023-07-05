import java.util.Map;
import java.util.TreeMap;

public class Java_02_hashmap2 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(45, "Brown");
        map.put(37, "James");
        map.put(23, "Martin");

        for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println( key + " " + value);
        }
    }
}
