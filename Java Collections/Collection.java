 import java.util.ArrayList;
 import java.util.Collections;

 public class Collection
 {
 	public static void main(String[] args) 
 	{
      ArrayList <Integer> list = new ArrayList <Integer>();
      ArrayList <Integer> list2 = new ArrayList <Integer>();
      for(int x = 1; x < 16; x++)
      {
      	if(x < 11)
      	{
      		list.add(x);
      	}
      	if(x > 5)
      	{
      		list2.add(x);
      	}
      }   
      Collections.shuffle(list);
      Collections.shuffle(list2);
      System.out.println(" ArrayList Elements");
      System.out.println("list1: \t" + list);
      System.out.println("list2: \t" + list2);

      System.out.println("list1 size :\t" + list.size());
      System.out.println("list2 size:\t" + list2.size());

      for (int x = 0; x < list2.size();x++)
      {
  		 if (!list.contains(list2.get(x)))
  		 {
			list.add(list2.get(x));
  		 }
      }

       Collections.sort(list);
       list.remove(list.size()/2);
       Collections.reverse(list);

       System.out.println("combined list:\t" + list);
       System.out.println("list size: \t" + list.size());





   }
 }