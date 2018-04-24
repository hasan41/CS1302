
// output of first question : 2 24 246 2468 246810
public class Questions {
public static int cumulativeSums(int a) {
        if (a==0) {
           return 0;
        }
           else {
               return (a +cumulativeSums(a-1));
}
}
public static int fib(int a){      
   
    if(a==0){    
        return 0;
    }
    if( a==1 ) {
        return 1; 
    } 
    else {
            
            
            return fib(a-1)+ fib(a-2);
            
            
                  
         }  
        
     }        

    public static void main (String[] args) {
    int a = 4;
        fib(a);
        System.out.println(fib(a));
       cumulativeSums(a);
       System.out.println(cumulativeSums(a));
       

    
}
}




