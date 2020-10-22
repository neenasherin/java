import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestLists {

  public static void main(String[] args) {
    
    // array list
    List<Integer> integers = Arrays.asList(7,2,6,4,5,7,3,1,0,-20);
    System.out.println(integers);
  
    // hash set
    Set<Integer> sIntegers = new HashSet<>(integers);
    System.out.println(sIntegers);
    sIntegers.forEach(System.out::println);
  
    // linked list
    List<Integer> llIntegers = new LinkedList<>(integers);
    System.out.println(llIntegers);
    
    // tree set
    SortedSet<Integer> tsIntegers = new TreeSet<>(sIntegers);
    System.out.println(tsIntegers);
    
    // linked hash set
    Set<Integer> lsIntegers = new LinkedHashSet<>(integers);
    System.out.println(lsIntegers);
    
    
  }
}
