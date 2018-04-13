import java.util.*;
public class Lab7
{
    public static void doubleList(ArrayList<String> stringList) {
    int x = stringList.size();
    
    for (int i = 0; i < x; i++) {
        String element = stringList.get(2 * i);
        stringList.add(2 * i + 1, element);
    }
    
    System.out.println(stringList);
}
        public static void minToFront(ArrayList<Integer> intList) { 
            
    int minimum = Integer.MAX_VALUE;
    int position = -1;
    
    for(int i = 0; i < intList.size(); i++) {
        if(intList.get(i) < minimum) {
            minimum = intList.get(i);
            position = i;
        }
    }
    
    intList.remove(position);
    intList.add(0, minimum);
    System.out.println(intList);
 }
    public static void intersect(ArrayList<Integer> intList, ArrayList<Integer> intList2) {
        ArrayList<Integer> intList3 = new ArrayList<Integer>();

        for (Integer i : intList) {
            if(intList2.contains(i)) {
                intList3.add(i);
            }
        }

        System.out.println(intList3);
    }
  public static void main (String[] args) {
        
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("how");
        stringList.add("are");
        stringList.add("you");
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        ArrayList<Integer> intList2 = new ArrayList<Integer>();
        intList2.add(2);
        intList2.add(3);
        intList2.add(5);
        System.out.println(stringList);
        System.out.println(intList);
        System.out.println(intList2);
        doubleList(stringList);
        minToFront(intList);
        intersect(intList,intList2);
        
        
        
    }
}

