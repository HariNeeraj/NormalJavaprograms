package Programs;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionPractice {
	
	public static void main(String[] args)
    {
        // Creating an empty array list
        ArrayList<String> bags = new ArrayList<String>();
  
        // Add values in the bags list.
        bags.add("pen");
        bags.add("pencil");
        bags.add("paper");
  
        // Creating another array list
        ArrayList<String> boxes = new ArrayList<String>();
  
        // Add values in the boxes list.
        boxes.add("pen");
        boxes.add("paper");
        boxes.add("books");
        boxes.add("rubber");
  
        // Before Applying method print both lists
        System.out.println("Bags Contains :" + bags);
        System.out.println("Boxes Contains :" + boxes);
  
        // Apply retainAll() method to boxes passing bags as parameter
        //boxes.retainAll(bags);
        boxes.addAll(bags);
        
        Object[] ob=bags.toArray();
        for(int i=0;i<ob.length;i++) {
        	System.out.println(ob[i]);
        	
        }
        
        ArrayList al= new ArrayList(Arrays.asList(ob));
        
        System.out.println(al);
  
        // Displaying both the lists after operation
        System.out.println("\nAfter Applying retainAll()"+
        " method to Boxes\n");
        System.out.println("Bags Contains :" + bags);
        System.out.println("Boxes Contains :" + boxes);
    }

}
