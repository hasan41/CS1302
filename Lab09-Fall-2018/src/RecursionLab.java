/*Hasan Naseer
 * Lab 09
 * October 19,2018
 */
public class RecursionLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(5);
		int a = 9;
		int k=8;
		System.out.print("\n");
		
		System.out.println(fib(k));
		System.out.println();   
        System.out.println(evenSum(a));
	}
	
	public static void print(int n) {
		if(n!=0) {
			print(n-1);
			printNum(n);
			System.out.println();
		}
	}
	
	public static void printNum(int n) {
		if(n!=0) {
			System.out.print(n + n + " ");
			printNum(n-1);
		}
	}
	
	public static int evenSum(int a) {
		if(a<=1) {
			return 0;
		}
		else if(a % 2 == 0) {
			return (a-1 + evenSum(a-3));
		}
		else {
			return (a+ evenSum(a-2));
		}
	}
		
	public static int fib(int a) {
		    if(a<=1) 
		        return a; 
		    else 
		        return fib(a-1) + fib(a-2) ;
		         
	}

	}
