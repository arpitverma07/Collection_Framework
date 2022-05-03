import java.util.*;

public class LearnSet {
    /*
    Set can be implemented using these three classes
    Hashset --- >  Normal Unordered_set as in C++
    LinkedSet -->  Order Will be maintained as the elements will be pushed in the set.
    TreeSet   -->  Normal set as in C++
    */

    public static void main(String arg[]) {
/*
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 11, 1, 2, 1, 10, 24, 15, 12, 46, 11, 54, 46));
        Set<Integer> set = new HashSet<>(list);
        Set<Integer> sortedSet = new TreeSet<>(list);
        Set<Integer> linkedSet = new LinkedHashSet<>(list);
        System.out.println(list);
        for (Integer i : list) {
           set.add(i);
        }
        System.out.println(set);
        System.out.println(sortedSet);
        System.out.println(linkedSet);
        set.remove(10);
        System.out.println(set.contains(11));
        System.out.println(set.size());
        System.out.println(set.isEmpty());
*/
        Set<Student> studentSet = new HashSet<>(Arrays.asList(new Student(1,"Avsvr") ,
                new Student(2,"Acae")
                ,new Student(3,"Ahca") ,
                new Student(4,"Pfcvah") ,
                new Student(5,"Many")));
        System.out.println(studentSet);
        studentSet.add(new Student(3 , "Akasha"));
        System.out.println(studentSet);



    }
}
