import java.util.*;
public class Hash // chose Hashtable because it has a key/value pair.
{

   public static void main(String args[]) {
      // Create a hash map<key, value>
      Hashtable <String,Integer> pairs = new Hashtable <String,Integer>();
      pairs.put("a", 1);
      pairs.put("b", 2);
      pairs.put("c", 3);
      pairs.put("d", 4);
      pairs.put("e", 5);

      if(pairs.containsKey("a"))
      {
         System.out.println(" key a, value " + pairs.get("a"));
      }
      else
      {
          pairs.put("a", 1);
      }

      for(String key:pairs.keySet())
      {
         System.out.println("key: " + key + " value: " + pairs.get(key));
      }
      System.out.println("size of hash: " + pairs.size());
   }
     
    
}
