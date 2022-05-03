import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
    /* Map interface can be implemented from class :
    * Hashmap ---> These are same as Unordered_map in cpp... keys will be in any order
    * TreeMap ---> These are same as Ordered_map in cpp .... Keys will be sorted
    * */

    public static void main(String args[] ){
        Map<Integer , String> hashMap = new HashMap<>();
        Map<Integer , String> treeMap = new TreeMap<>();

/*
        hashMap.put(100,"one");
        hashMap.put(10 , "ten");
        hashMap.put(300 , "Three");
        hashMap.put(11 , "Eleven");

        for(Map.Entry<Integer, String> entry : hashMap.entrySet())
            System.out.println("The Key : " + entry.getKey() + " and the Value : " + entry.getValue());
        for(Integer key : hashMap.keySet())
            System.out.println("The Key is :" + key);
        for(String value : hashMap.values())
            System.out.println("The Values is :" + value);
*/

        treeMap.put(100,"one");
        treeMap.put(10 , "ten");
        treeMap.put(300 , "Three");
        treeMap.put(11 , "Eleven");
        System.out.println(treeMap);

        for(Map.Entry<Integer, String> entry : treeMap.entrySet())
            System.out.println("The Key : " + entry.getKey() + " and the Value : " + entry.getValue());
        for(Integer key : treeMap.keySet())
            System.out.println("The Key is :" + key);
        for(String value : treeMap.values())
            System.out.println("The Values is :" + value);




    }


}
