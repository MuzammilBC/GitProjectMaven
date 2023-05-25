package git;

public class Calculator {
	static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	static void sub(int a, int b) {
		System.out.println(a-b);
	}
	static void mult(int a, int b) {
		System.out.println(a*b);
	}
	static void div(int a, int b) {
		System.out.println(a/b);
	}
	static void mod(int a, int b) {
		System.out.println(a%b);
	}
	public static void main(String[] args) {
		
		add(10, 10);
		sub(10, 10);
		mult(10, 10);
		div(50, 5);
		mod(12, 3);
	}
}
