package morning;

//class Java
//{
//	Java()//constructor
//	{
//		System.out.println("hello Java");
//	}
//	void program()//function
//	{
//		System.out.println("High level Language");
//	}
//}
//public class OopsConcepts {
//
//	public static void main(String[] args)
//	{
//		Java j=new Java();//constructor call
//		j.program();//function call
//	}
//
//}

//class Calc
//{
//	void area()
//	{
//		int a=5;
//		System.out.println("Area of Square is..."+a*a);
//	}
//	void area(int r)
//	{
//		double d=3.14*r*r;
//		System.out.printf("Area of circle is..%.3f\n",d);
//	}
//	void area(int b,int h)
//	{
//		double d=(0.5)*b*h;
//		System.out.println("Area of triangle is..."+d);
//	}
//}
//public class OopsConcepts {
//
//	public static void main(String[] args)
//	{
//		Calc c=new Calc();
//		c.area();
//		c.area(3);
//		c.area(4,5);
//	}
//
//}
//class Java
//{
//	String name="James Gosling";
//	void demo()
//	{
//		System.out.println("Java developed by..."+name);
//	}
//}
//
//class Python extends Java
//{
//	String name="Guido Van Rossum";
//	void demo()
//	{
//		System.out.println("Python developed by..."+name);
//		super.demo();
//		System.out.println(super.name);
//	}
//}
//public class OopsConcepts {
//
//	public static void main(String[] args)
//	{
//		Python p=new Python();
//		p.demo();
//	}
//
//}

//class Java
//{
//	Java()
//	{
//		System.out.println("Hello Java");
//	}
//	Java(int year)
//	{
//		System.out.println("Launched by..."+year);
//	}
//	Java(String team)
//	{
//		System.out.println("Java developed by "+team);
//	}
//}

//public class OopsConcepts {
//
//	public static void main(String[] args)
//	{
//		new Java();
//		new Java(1995);
//		new Java("Green Team");
//	}
//
//}

//class Java
//{
//	int a;
//	void demo(int a)
//	{
//		this.a=a;
//		System.out.println(this.a);
//	}
//}
//public class OopsConcepts {
//
//	public static void main(String[] args)
//	{
//		Java j=new Java();
//		j.demo(45);			
//	}
//}

//final class Java
//{
//	String name="James Gosling";
//	final void demo()
//	{
//		System.out.println("Java developed by..."+name);
//	}
//}
//
//class Python extends Java
//{
//	String name="Guido Van Rossum";
//	void demo()
//	{
//		System.out.println("Python developed by..."+name);
//		super.demo();
//		System.out.println(super.name);
//	}
//}
//public class OopsConcepts {
//
//	public static void main(String[] args)
//	{
//		Python p=new Python();
//		p.demo();
//		final int a=10;
//	}
//
//}

abstract class Car
{
	abstract void drive();
	void demo()
	{
		System.out .println("Hello");
	}
}
class Swift extends Car
{
	void drive() {
		System.out.println("I have Swift car");
	}
}
public class OopsConcepts {

	public static void main(String[] args)
	{
		Swift s=new Swift();
		s.drive();
		s.demo();
	}
}
