package map;

import java.util.*;

public class HashMapExamble {

    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<Integer, String>();

        // Add value to map
        hm.put(1,"sathish");
        hm.put(3,"kumar");
        hm.put(2,"sathish");

        //Print the map
        System.out.println(hm);

        //Get the key only
       Set key = hm.keySet();
        System.out.println("Key only "+key);

        // Get the Value only
        Collection value = hm.values();
        System.out.println("value only "+value);

        // Get the key value entry
        Set keyValue = hm.entrySet();
        System.out.println("Entry "+keyValue);

        //Using iterator to print value
        Iterator i = keyValue.iterator();

        while(i.hasNext()){
            //print all values
      //      System.out.println(i.next());
            //Type cast Object Type to Map Entry type
            Map.Entry mapEntry = (Map.Entry) i.next();
            // Get Key value only
            System.out.println(mapEntry.getKey());
            // Get Value only
            System.out.println(mapEntry.getValue());
            //checking condition
            if(mapEntry.getKey().equals(2)){
                mapEntry.setValue("Dhoni");
            }
        }
        System.out.println(hm);
    }


}
