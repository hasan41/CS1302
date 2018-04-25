
/**
 * Write a description of class Lab11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab11
{
   
    public static void selectionSort(int [] arr)
    {
        
     for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;
                }  
            }  
            int min = arr[index];   
            arr[index] = arr[i];  
            arr[i] = min;  
        }  
    }
    public static void BubbleSort(int [] arr)
    {
        int x = arr.length;  
        int temp = 0;  
         for(int i=0; i < x; i++){  
                 for(int j=1; j < (x-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
    }
    public static void insertionSort(int [] arr)
    {
         int y = arr.length;  
        for (int j = 1; j < y; j++) {  
            int x = arr[j];  
            int i = j-1;  
            while ( (i > -1) && ( arr [i] > x ) ) {  
                arr [i+1] = arr [i];  
                i--;  
            }  
            arr[i+1] = x;  
        }  
    }
    
    public static void main(String[] args) {
        int [] arr1 = {5,6,4,3,2};
        int [] arr2 = {8,3,5,2,1};
        int [] arr3 = {2,6,9,3,4};
        System.out.println(" ");
        System.out.println("arr1");
        for (int i = 0; i< arr1.length; i++) {
            System.out.print(arr1[i]);
        
    }
    System.out.println(" ");
    System.out.println("arr2");
     for (int i = 0; i< arr2.length; i++) {
            System.out.print(arr2[i]);
        
    }
    System.out.println(" ");
    System.out.println("arr3");
     for (int i = 0; i< arr3.length; i++) {
            System.out.print(arr3[i]);
        
    }
    
    selectionSort(arr1);
    BubbleSort(arr2);
    insertionSort(arr3);
    
    System.out.println(" ");
    
    System.out.println("Sorted arrays");
    System.out.println("arr1");
    for (int i = 0; i< arr1.length; i++) {
            System.out.print(arr1[i]);
        
    }
    System.out.println(" ");
    System.out.println("arr2");
     for (int i = 0; i< arr2.length; i++) {
            System.out.print(arr2[i]);
        
    }
    System.out.println(" ");
    System.out.println("arr3");
     for (int i = 0; i< arr3.length; i++) {
            System.out.print(arr3[i]);
        
    }
    
}
}
