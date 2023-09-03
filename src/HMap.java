import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class HMap {

    public static void main(String[] args) {

        {

            // HashMap declaration
            HashMap<Integer, String> myHashMap = new HashMap<Integer, String>();

            //Adding elements into HashMap
            myHashMap.put(7, "Johnny");
            myHashMap.put(8, "Ivy");
            myHashMap.put(1, "Rick");
            myHashMap.put(4, "Stan");
            myHashMap.put(3, "Kyle");

            //print out the map content using Iterator
            Set set = myHashMap.entrySet();
            Iterator iterator = set.iterator();
            while (iterator.hasNext()) {
                Map.Entry mapEntry = (Map.Entry) iterator.next();
                System.out.print("key: " + mapEntry.getKey() + " value: ");
                System.out.println(mapEntry.getValue());
            }
            System.out.println("get an element from myHashMap via key and print the value out:");
            System.out.println(myHashMap.get(8));
            //print out hashMap on standard way:
            System.out.println(myHashMap);

            // Get values based on key
            String var = myHashMap.get(2);
            //here we'll get null, we don't have such a key
            System.out.println("Value with key 2: " + var);
            var = myHashMap.get(7);
            System.out.println("Value with key 7: " + var);

            // Remove values based on key
            myHashMap.remove(4);
            System.out.println("myHashMap after removing element:");
            System.out.println(myHashMap);
            myHashMap.clear();
            System.out.println("myHashMap after total clearing:");
            System.out.println(myHashMap);
        }

    }
}

//OUTPUT:
/*    Ivy
    {1=Rick, 3=Kyle, 4=Stan, 7=Johnny, 8=Ivy}
    Value with key 2: null
        Value with key 7: Johnny
        myHashMap after removing element:
        {1=Rick, 3=Kyle, 7=Johnny, 8=Ivy}
        myHashMap after total clearing:
        {}
*/
