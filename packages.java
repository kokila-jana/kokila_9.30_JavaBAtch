package pack;

public class ADD {
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}

}

package pack;

public class Sub 
{
	public int sub()
	{
		int a=10,b=5;
		int c=a-b;
		return c;
	}

}


package pack;

public class Mul 
{
	public void demo()
{
	for(int i=1;i<=5;i++)
	{
		System.out.println(i);
	}
}
}


package kokila;
//import pack.*;
//public class Call {
//
//	public static void main(String[] args) {
//		ADD a=new ADD();
//		Mul m=new Mul();
//		Sub s=new Sub();
//		a.add(12,36);
//		System.out.println(s.sub());
//		m.demo();
//	}
//
//}

//import pack.ADD;
//import pack.Mul;
//import pack.Sub;
//public class Call {
//
//	public static void main(String[] args) {
//		ADD a=new ADD();
//		Mul m=new Mul();
//		Sub s=new Sub();
//		a.add(12,36);
//		System.out.println(s.sub());
//		m.demo();
//	}
//
//}

public class Call {

	public static void main(String[] args) {
		pack.ADD a=new pack.ADD();
		pack.Mul m=new pack.Mul();
		pack.Sub s=new pack.Sub();
		a.add(12,36);
		System.out.println(s.sub());
		m.demo();
	}

}

