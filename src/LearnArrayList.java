import java.util.*;

public class LearnArrayList {
    public static void main(String args[]){
/*
        List<Student> A = new ArrayList<>();
        A.add(new Student(1,"Arpit"));
        A.add(new Student(20,"Shank"));
        A.add(new Student(30,"Panjiva"));
        A.add(new Student(12,"Arpit2"));
        A.add(new Student(11,"Shank2"));
        A.add(new Student(25,"Panjiva2"));

        System.out.println(A);
        Collections.sort(A, (o1, o2) -> -o1.rollNo + o2.rollNo);
        System.out.println(A);
*/

        List<Integer> list = new ArrayList<>(Arrays.asList(1,12,23,14,500));

        System.out.println(list);
        list.set(2,2);
/*
        for(int i = 0;i< list.size();i++){
            System.out.println("Item at : " + i + " is " + list.get(i));
        }
        for(Integer  element : list)
            System.out.println("Element is :"+ element);
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext())
            System.out.println("Element is :"+ iterator.next());
        Collections.sort(list, (o1, o2) -> o2-o1);
*/


        System.out.println(list);

    }
}
