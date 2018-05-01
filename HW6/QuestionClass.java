

public class QuestionClass
{
    // instance variables - replace the example below with your own
    

    
    public static int[] ModifiedSelectSort(int[] set)
    {
        for( int i = 0; i<set.length-1; i++) {
            int x = i;
            for( int j = i + 1; j<set.length; j++) {
                if(set[j] > set[x]) {
                    x = j;
                    int y = set[x];
                    set[x] = set[i];
                    set[i] = y;
                
    }
    
}
}
return set;
}
 public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];

        array[index1] = array[index2];
        array[index2] = temp;

        
    }
public static void dualSelectionSort(int[] a) {
 for (int i = 0; i < a.length / 2; i++) {
 int min = i;
 int max = a.length - 1 - i;
 for (int j = i; j < a.length - i; j++) {
 if (a[j] < a[min]) {
 min = j;
 }
 if (a[j] > a[max]) {
 max = j;
 }
 }
 if (max == i) { 
 max = min;
 }
 swap(a, i, min);
 swap(a, a.length - 1 - i, max);
 }
}
public static void main(String a[]) {
    int[] array = {1,4,9,8,6,2,3};
    ModifiedSelectSort(array);
    for( int i:array) {
        System.out.print(i);
        System.out.print(",");
}
System.out.println(" ");
dualSelectionSort(array);
for( int i:array) {
        System.out.print(i);
        System.out.print(",");
}
}
}
