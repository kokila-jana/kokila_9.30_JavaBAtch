package morning;

import java.util.Scanner;

public class ArrayConcepts {

	public static void main(String[] args)
	{
//		int a=10;
//		a=85;
//		a=74;
//		System.out.println(a);
		
//		
//		int a[]= {12,6,39,1,9,35,6};
//		System.out.println(a.length);
//		System.out.println(a[2]);
		/*        4    8    12   16  20 24  28
		 * a=>   12    6    39   1   9  35   6
		 * 
		 *       0     1     2   3   4   5   6
		 *       
		 *       
		 *       index=length-1
		 *       
		 *       
		 *       java Arry Syntax
		 *       data-type  variable=new data-type[size];
		 */
//		int a[]=new int[3];
//		a[0]=45;
////		a[1]=34;
//		a[2]=6;
//		System.out.println(a.length);
//		System.out.println(a);
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
		/*
		 * 1)i=0   0<3   a[0]-->45   0+1=1
		 * 2)i=1   1<3   a[1]-->34   1+1=2
		 * 3)i=2   2<3   a[2]-->6    2+1=3
		 * 4)i=3   3<3(false)
		 */
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size...");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array elements...");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("array elements are...");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		/*
		 * a=12  6   1
		 *   0   1   2
		 *   
		 * 1)i=0   0<2   
		 * 		j=0+1=1  1<3
		 *        if(a[i]>a[j])if(12>6)
		 *        int temp=12
		 *        a[i]=6
		 *        a[j]=12   -->6  12  1
		 *      j=2   2<3
		 *      if(a[i]>a[j]if(6>1)
		 *      int temp=6
		 *      a[i]=1
		 *      a[j]=6     -->1   12   6
		 *      j=3   3<3(false)
		 * 2)i=1    1<2
		 *     j=1+1=2   2<3
		 *     if(a[i]>a[j])   if(12>6)
		 *     int temp=12
		 *     a[i]=6
		 *     a[j]=12 --> 
		 *     j=3   3<3(false)
		 * 3)i=2  2<2(false)
		 */
		
		System.out.println("Ascending array elements are...");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		
		
		
		
		
		
//		int max=a[0];
//		for(int i=1;i<a.length;i++)
//		{
//			if(max<a[i])
//			{
//				max=a[i];
//			}
//		}
//		System.out.println("The max element in given array is...."+max);
//		
//		int min=a[0];
//		for(int i=1;i<a.length;i++)
//		{
//			if(min>a[i])
//			{
//				min=a[i];
//			}
//		}
//		System.out.println("The min element in given array is...."+min);
		/*
		 * 1)a=1    1<5         1+1=2
		 *     if(21<6)false
		 * 2)a=2    2<5         2+1=3
		 * 			if(21<95)-->max=95
		 * 
		 */
		
		
		
		
		
		
		
	}

}
