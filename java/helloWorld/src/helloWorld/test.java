package helloWorld;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		test1330();
		test10718();

	}
	
	private static void test1330() {
		int a, b;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();

		if (a > b)
			System.out.print(">");
		else if (a < b)
			System.out.print("<");
		else
			System.out.print("==");
	}
	
	private static void test10718() {
		
		System.out.println("강한친구 대한육군\n".repeat(2));
		
	}
	

}