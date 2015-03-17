package Recursion;

public class Q1_NthFibonacci {

	/**
	 * @param args
	 * Write a method to generate the nth Fibonacci number.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getNthFibonacci(5));
		System.out.println(nthFibonacciIterative(5));
	}
	public static int getNthFibonacci(int n){
		if(n==1)
			return 1;
		if(n==2)
			return 1;
		return (getNthFibonacci(n-1)+getNthFibonacci(n-2));
	}
	public static int nthFibonacciIterative(int n){
		int a = 0;
		int b = 1;
		while(n>0){
			int c = a+b;
			a = b;
			b = c;
			n--;
		}
		return a;
	}
}
