package sets;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Sets and List are mostly same the only
		 * difference is that sets contains only unique values
		 */

  Set<String> mySet=new LinkedHashSet<String>();
  mySet.add("Qadir");
  mySet.add("Qadir");
  mySet.add("Qadir");
  mySet.add("Khan");
  System.out.println("OUtput for Set LinkedHashSet");
  for(String i:mySet) {
	  System.out.println(i);
  }
  /* This is the Output for LinkedHashSet which is in Sequence
   * Qadir
     Khan
   * 
   * For HashSet the outpus is in Ascending Order 
   * We can also use Sets for Removing the Duplicate values 
   * 
List<Integer> listNumbers = Arrays.asList(3, 9, 1, 4, 7, 2, 5, 3, 8, 9, 1, 3, 8, 6);
System.out.println(listNumbers);
Set<Integer> uniqueNumbers = new HashSet<>(listNumbers);
System.out.println(uniqueNumbers);
Output:
1
2
[3, 9, 1, 4, 7, 2, 5, 3, 8, 9, 1, 3, 8, 6]
[1, 2, 3, 4, 5, 6, 7, 8, 9]

   */
  
 
  List<Integer> myList=new ArrayList<Integer>();
  myList.add(2);
  myList.add(3);
  myList.add(5);
  myList.add(5);
  System.out.println("OUtput for List");
  for(int s:myList) {
	  System.out.println(s);
  }
  Set<Integer> removeDuplicate=new HashSet<>(myList);
  System.out.println("After Removing the Duplicate Values"+ removeDuplicate);
  
 
	}

}
