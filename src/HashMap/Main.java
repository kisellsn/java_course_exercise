package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args){
        TreeMap<String,String> dict = new TreeMap<>();
//        HashMap<String,String> dict = new HashMap<>();
//        LinkedHashMap<String,String> dict = new LinkedHashMap<>();
        dict.put("brave","ready to face and endure danger or pain; showing courage.");
        dict.put("unpleasant","causing discomfort, unhappiness, or revulsion; disagreeable.");
        dict.put("happiness","the state of being happy.");

        for (String key:dict.keySet()){
            System.out.println(dict.get(key));
        }
        for(Map.Entry<String,String> entry:dict.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }
    }
}
