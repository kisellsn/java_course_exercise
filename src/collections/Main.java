package collections;

import java.util.*;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> arraylist = new ArrayList<>(9);
        for (int i=0;i<15;i++){
            arraylist.add(i);
        }
        System.out.println(arraylist.size());
//        for (int value:arraylist){
//            System.out.println(value);
//        }
        List<String> linkedList = new LinkedList<>();
        for (int i=10;i>0;i--){
            linkedList.add(Integer.toString(i));
        }
        for (String value:linkedList){
            System.out.println(value);
        }
        Collections.sort(linkedList);

        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Vehicle("dcdc",12000));
        vehicleList.add(new Vehicle("frgr",78000));
        for (Vehicle car:vehicleList){
            System.out.println(car);
        }
//        vehicleList.remove(0);
        Collections.sort(vehicleList);
        printList(linkedList, linkedList.size());
        printList(vehicleList,vehicleList.size());
    }
    public static void printList(List list, int max){
        System.out.println("Your list:");
        for (int i = 0; i<max; i++){
            System.out.println(list.get(i));
        }
    }
}
