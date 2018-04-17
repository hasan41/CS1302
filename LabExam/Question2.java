
/**
 * Write a description of class Question2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question2
{
    
    public static void Sort(int[] array){  
        //begins at for loop
        for (int i = 0; i < array.length - 1; i++)  
        {  
            int y = i;  
            for (int j = i + 1; j < array.length; j++){  
                if (array[j] < array[y]){  
                    y = j;
                }  
            }  
            int x = array[y];   
            array[y] = array[i];  
            array[i] = x;  
        }  
    }  
    
    public static void main (String[] args) {
        int[] testArray = {9,4,3,2,1};
        System.out.println("This is our array before we run the Sort method (which is a selection sort)");
        
        for (int i = 0; i<testArray.length; i++) {
            System.out.println(testArray[i]);
        
    }
    System.out.println("This is our array after we run the Sort method");
    Sort(testArray);
     for (int i = 0; i<testArray.length; i++) {
            System.out.println(testArray[i]);
        
    }
    
    
}
}
