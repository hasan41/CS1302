import java.util.*;
public class removeZeroesAssignment
{
    public static void removeZeroes(ArrayList<Integer> mylist) {
        for(int i = 0; i< mylist.size(); i++) {
            if (mylist.get(i)==0) {
                mylist.remove(i);
            }
        }
    }
    public static void main (String[] args) {
        Integer[] mylist = {0,1,0,2,3,4};
        ArrayList<Integer> print = new ArrayList<Integer>(Arrays.asList(mylist));
        System.out.println(print);
        removeZeroes(print);
        System.out.println("new list : " + print);
    }
    
   
}
