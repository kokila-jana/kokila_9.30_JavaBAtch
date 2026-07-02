package morning;
import java.util.Scanner;
public class First {

	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		System.out.println(c);
		sc.nextLine();
		System.out.println("enter your full name");
//		String s=sc.next();
		String s=sc.nextLine();
		System.out.println(s);
		System.out.println("Enter 2 numbers...");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c1=a+b;
		System.out.println(c1);
		
		

	}

}
