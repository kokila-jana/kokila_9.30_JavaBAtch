/*
		 * While loop
		 * initialization;-->1
		 * while(condition)-->2
		 * {
		 * 		//block-->3
		 *      inc/dec-->4
		 * }
		 */
		
//		int i=1;
//		while(i<=10)
//		{
//			System.out.println(i);
//			i++;
//		}
		
//		int i=10;
//		while(i>=1)
//		{
//			System.out.println(i);
//			i--;
//		}
		
//		int i=1;
//		while(true)
//		{
//			System.out.println(i);
//			i++;
//		}

//		int i=1;
//		while(i<=10)
//		{
//			i++;
//			System.out.println(i);
//		}
		
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int i=1;
//		int fact=1;
//		while(i<=a)
//		{
//			fact*=i;
//			i++;
//		}
//		System.out.println(fact);
		
		/*
		 * 121
		 * 123321
		 * 1234
		 * 4+30+200+1000
		 */
		
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int x=a;
//		int b=0;
//		while(a>0)
//		{
//			int c=a%10;
//			b=b*10+c;
//			a=a/10;
//		}
//		System.out.println(b);
//		if(x==b)
//		{
//			System.out.println("Palindrome");
//		}
//		else
//		{
//			System.out.println("not palindrome");
//		}
		
		/*
		 * a=1234
		 * b=0
		 * 1)1234>0
		 * c=1234%10-->c=4
		 * b=0*10+4-->b=4
		 * a=1234/10-->a=123
		 * 
		 * 2)123>0
		 * c=123%10-->c=3
		 * b=4*10+3-->b=43
		 * a=123/10-->a=12
		 * 
		 * 3)12>0
		 * c=12%10-->c=2
		 * b=43*10+2-->b=432
		 * a=12/10-->a=1
		 * 
		 * 4)1>0
		 * c=1%10-->c=1
		 * b=432*10+1-->b=4321
		 * a=1/10-->a=0
		 * 
		 * 5)0>0(false)
		 */
		
		
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=0;
//		while(a>0)
//		{	
//			b++;
//			a=a/10;
//		}
//		System.out.println(b);
		
		
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int odd=0,even=0;
//		while(a>0)
//		{	
//			int c=a%10;
//			if(c%2==0)
//			{
//				even++;
//			}
//			else
//			{
//				odd++;
//			}
//			a=a/10;
//		}
//		System.out.println(odd+" "+even);
		
		
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=0;
//		while(a>0)
//		{	
//			int c=a%10;
//			b+=c;
//			a=a/10;
//		}
//		System.out.println(b);
		
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=1;
//		while(a>0)
//		{	
//			int c=a%10;
//			b*=c;
//			a=a/10;
//		}
//		System.out.println(b);
		
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		while(a>0)
//		{	
//			int c=a%10;
//			System.out.println(c);
//			a=a/10;
//		}
		
		/*
		 * do while loop
		 * syntax
		 * 
		 * initialization->1
		 * do
		 * {
		 * block-->2
		 * inc/dec-->3
		 * }while(condition);-->4
		 * 
		 */
		
//		int i=1;
//		do
//		{
//			System.out.println(i);
//			i++;
//		}
//		while(i>=10);
		
		
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println(i);
//			if(i==5)
//			{
//				break;
//			}
//		}
		
		
//		for(int i=1;i<=10;i++)
//		{
//			if(i==5)
//			{
//				continue;
//			}
//			System.out.println(i);
//		}
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter 2 numbers...");
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		System.out.println("Enter the operator..");
//		char c=sc.next().charAt(0);
//		switch(c)
//		{
//		case '+':System.out.println(a+b);break;
//		case '-':System.out.println(a-b);break;
//		case '*':System.out.println(a*b);break;
//		case '/':System.out.println(a/b);break;
//		
//		default:
//			System.out.println("Invalid operator..");
//		}
