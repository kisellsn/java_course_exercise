package HashSet_and_LinkedHashSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedset = new LinkedHashSet<>();
        HashSet<Integer> arrayset = new HashSet<>();

        arrayset.add(1);
        arrayset.add(45);
        arrayset.add(48);
        arrayset.add(45);

        for (int value:arrayset){
            System.out.println(value);
        }

        linkedset.add(1);
        linkedset.add(45);
        linkedset.add(48);
        linkedset.add(45);

        for (int value:linkedset){
            System.out.println(value);
        }

        LinkedHashSet<Animals> animals = new LinkedHashSet<>();
        animals.add(new Animals("bird", 10));
        animals.add(new Animals("dog", 12));
        animals.add(new Animals("cat", 8));
        animals.add(new Animals("dog", 12));

        for (Animals animal:animals){
            System.out.println(animal);
        }
    }
}
