package step1;

import java.util.Scanner;

public class Ninth {

	static int add(int n1, int n2) {
		return n1 + n2;
	}

	static int min(int n1, int n2) {
		return n1 - n2;
	}

	static int mul(int n1, int n2) {
		return n1 * n2;
	}

	static int div(int n1, int n2) {
		return n1 / n2;
	}

	static int mod(int n1, int n2) {
		return n1 % n2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ninth sev = new Ninth();

		int num1, num2;
		char oper;
		String yn;
		System.out.println("support +,-,*,/,%");
		num1 = sc.nextInt();
		oper = sc.next().charAt(0);
		num2 = sc.nextInt();

		switch (oper) {
		case '+':
			System.out.println(" " + num1 + "+" + num2 + " " + Ninth.add(num1, num2));
			break;
		case '-':
			System.out.println(" " + num1 + "-" + num2 + " " + Ninth.min(num1, num2));
			break;
		case '*' :
			System.out.println(" " + num1 + "*" + num2 + " " + Ninth.mul(num1, num2));
			break;
		case '/' :
			System.out.println(" " + num1 + "/" + num2 + " " + Ninth.div(num1, num2));
			break;
		case '%' :
			System.out.println(" " + num1 + "%" + num2 + " " + Ninth.mod(num1, num2));
			break;
		}
		

	}

}
