package generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Container<Integer,String> container = new Container<>(1, "string");
//        Container<Double,Integer> container = new Container<>(1, 1);...
        int it1 = container.getItem1();
        String it2 = container.getItem2();
        System.out.println(container.toString());


        Set<String> set1 = new HashSet<>();
        set1.add("Hello ");
        set1.add("World");
        set1.add("!");

        Set<String> set2 = new HashSet<>();
        set2.add("Bye ");
        set2.add("World");
        set2.add("!");

        Set<String> resultSet = unionFunc(set1,set2);


        Iterator<String> iterator = resultSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static <E> Set<E> unionFunc(Set<E> s1, Set<E> s2){
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }
}
