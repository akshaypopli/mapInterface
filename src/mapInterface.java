import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class mapInterface {
    public static void main(String[] args) {
        // write your code here

        //NOTE: In Hashmap if you print out keys they can be in any order(May not be in the order in which they put)
        Map hm = new HashMap();
        hm.put("Zara", "8");
        hm.put("Mahnaz", "31");
        hm.put("Ayan", "12");
        hm.put("Daisy", "14");
        hm.put("Akshay", "13");

        System.out.println("hashMap: "+hm.keySet());

        //NOTE: In TreeMap if you print out keys they will be printed out in Order(Independent of how you put them in)
        TreeMap<Integer, Integer> tm = new TreeMap<>();

        tm.put(1,3);
        tm.put(5,2);
        tm.put(6,33);
        tm.put(3,11);
        tm.put(2,34);

        System.out.println("treeMap: " + tm.keySet());

        //NOTE:  In LinkedHashMap if you print out keys they will be in order in which you put them.
        LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap();
        lhm.put(-1, 1);
        lhm.put(-2, 2);
        lhm.put(-6, 4);
        lhm.put(0, 5);
        lhm.put(1, 3);

        System.out.println("LinkedHashMap: "+lhm.keySet());
    }
}
