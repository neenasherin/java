import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * TestMap
 */
public class TestMap {
  public static void main(String[] args) {

    Map<Integer, String> map = new HashMap<>();
    map.put(1, "one");
    map.put(2, "two");
    map.put(4, "four");
    map.put(0, "zero");
    map.put(-10, "minus ten");
    map.put(5, "five");
    map.put(5, "another five");

    map.forEach((k,v) -> System.out.println (k + " = " + v));

    SortedMap<Integer, String> sortedMap = new TreeMap<>(map);
    System.out.println(sortedMap);

    Map<Integer, String> lMap = new LinkedHashMap<>(map);
    System.out.println(lMap);
  }
  
}
