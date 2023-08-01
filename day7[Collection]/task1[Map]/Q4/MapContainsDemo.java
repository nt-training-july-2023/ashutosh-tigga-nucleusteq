import java.util.Hashtable;
import java.util.Map;

public class MapContainsDemo {
    public static void main(String[] args) {
        Map<Integer, String> listOfMapData = new Hashtable<Integer, String>();
        listOfMapData.put(1, new String("ashu"));
        listOfMapData.put(2, "ashu");
        System.out.println(" listOfMapData.containsKey(3) " + listOfMapData.containsKey(3));
        System.out.println(" listOfMapData.containsKey(1) " + listOfMapData.containsKey(1));
        System.out.println(
                "listOfMapData.containsValue(new String(\"ashu\") " + listOfMapData.containsValue(new String("ashu")));
    }
}
