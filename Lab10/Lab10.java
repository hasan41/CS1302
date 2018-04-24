

public class Lab10
{
    int [] numbers = {5,4,3,2,1};
    int [] sorted = {1,2,3,4,5};
    

     public static int sequentialSearch(int[] numbers, int x)
   {
      for (int i = 0; i < numbers.length; i++)
      {
         if (numbers[i] == x)
         {
            return x;
         }
     }
     return -1 ;
   }
   public static int binarySearch( int[] sorted, int y) {
       int first = 0;
      int last = sorted.length - 1;
      while (first <= last)
      {
         int middle = (first + last) / 2;
         if (y < sorted[middle])
         {
            last = middle-1;
         }
         else if (y > sorted[middle])
         {
            first = middle + 1;
         }
         else {
            return middle;
         }
       }
       return 1;
       
       
    }
    public static int recursiveBinary(int[] sorted, int a, int b, int c) {
      
        if (a < b) {
            int mid = a + (b - a) / 2;  
            if (c < sorted[mid]) {
                return recursiveBinary(sorted, a, mid, c);
                 
            } else if (c > sorted[mid]) {
                return recursiveBinary(sorted, mid+1, b , c);
                 
            } else {
                return mid;   
            }
        }
        return -1;  
    }
        
    
    public static void main (String[] args) {
        int [] numbers = {5,4,3,2,1};
        int [] sorted = {1,2,3,4,5};
        System.out.println(sequentialSearch(numbers, 4));
        System.out.println(binarySearch( sorted, 2));
        System.out.println(recursiveBinary( sorted,1,5,3));
    }
}
