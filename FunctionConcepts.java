 package morning;

import java.util.Scanner;

//public class FunctionConcepts 
//{
//	static int add(int a,int b)
//	{
//		int c=a+b;
//		return c;
//	}
//
//	public static void main(String[] args) 
//	{
//		int x=add(123,69);
//		System.out.println(x);
//		System.out.println(add(12,36));
//	}
//
//}
 
// public class FunctionConcepts 
// {
//	 static int isPalindrome(int a)
//	 {
//		 int b=0;
//		 while(a>0)
//		 {
//			 int c=a%10;
//			 b=b*10+c;
//			 a=a/10;
//		 }
//		 return b;
//	 }
// 	public static void main(String[] args) 
// 	{
// 		Scanner sc=new Scanner(System.in);
// 		System.out.println("Enter the number...");
// 		int a=sc.nextInt();
// 		int b=isPalindrome(a);
// 		if(a==b)
// 		{
// 			System.out.println("Palindrome");
// 		}
// 		else
// 		{
// 			System.out.println("not palindrome");
// 		}
// 		
// 	}
//
// }

//public class FunctionConcepts 
//{
//	static void sum(int a)
//	{
//		if(a<0)
//		{
//			System.out.println(a+" is negative number..");
//		}
//		else
//		{
//			int sum=0;
//			for(int i=a;i<=a+9;i++)
//			{
//				sum+=i;
//			}
//			System.out.println("sum of ten numbers is"+ sum);
//			
//		}
//	}
//	 
//	public static void main(String[] args) 
//	{
//		Scanner sc=new Scanner(System.in);
// 		System.out.println("Enter the number...");
// 		int a=sc.nextInt();
// 		
//		sum(a);
//	}
//
//}
	
	
//public class FunctionConcepts 
//{	
//	static int linearSearch()
//	{
//		int a[]= {12,69,6,7,21,59,3,5,3};
//		int key=12;
//		for(int i=0;i<a.length;i++)
//		{
//			if(key==a[i])
//			{
//				return i;
//			}
//		}
//		return -1;
//		
//	}
//	
//	public static void main(String[] args) 
//	{
//		int a=linearSearch();
//		if(a==-1)
//		{
//			System.out.println("Element not found");
//		}
//		else
//		{
//			System.out.println("Element found at "+a+" index position");
//		}
//	}
//
//}

//public class FunctionConcepts 
//{	
//	static void table()
//	{
//			Scanner sc=new Scanner(System.in);
//			int a=sc.nextInt();
//			for(int i=1;i<=10;i++)
//			{
//				System.out.println(a+"x"+i+"="+a*i);
//			}
//	}
//	
//	public static void main(String[] args) 
//	{
//		table();
//		table();
//		table();
//		
//	}
//
//}

//public class FunctionConcepts 
//{	
//	static int fact(int a)
//	{
//			if(a==0 ||  a==1)
//			{
//				return 1;
//			}
//			else
//			{
//			return a*fact(a-1);
//			}
//	}
//	/*
//	 * a=5
//	 * fact(5)
//	 * 5*fact(4)
//	 * 5*4*fact(3)
//	 * 5*4*3*fact(2)
//	 * 5*4*3*2*fact(1)
//	 * 5*4*3*2*1-->120
//	 * 
//	 */
//	
//	public static void main(String[] args) 
//	{
//		System.out.println(fact(5));
//		
//	}
//
//}
/*
 * witout return-->void
 * 
 * public static return-type functionName(arguments)
 * {
 * 		//block
 * }
 */

public class FunctionConcepts 
{		
	static int x=45;
	static  void add()
	{	
		 x+=5;
		System.out.println(x);
	}
	public static void main(String[] args) 
	{
		add();
		add();
	}
}
/*
 * variable
 * 3 types
 * 1.local variable-->with in function
 * 2.global variable-->inside the class,outside the function
 * 3.static variable-->inside the class,outside the function
 * use static keyword
 */


