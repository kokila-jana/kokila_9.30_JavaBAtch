Scanner sc=new Scanner(System.in);
//		System.out.println("Enter array size...");
//		int size=sc.nextInt();
//		int a[]=new int[size];
//		System.out.println("Enter array elements...");
//		for(int i=0;i<size;i++)
//		{
//			a[i]=sc.nextInt();
//		}
//		System.out.println("array elements are...");
//		for(int i=0;i<size;i++)
//		{
//			System.out.println(a[i]);
//		}
//		
//		Arrays.sort(a);
//		System.out.println("Ascending array elements are...");
//		for(int i=0;i<size;i++)
//		{
//			System.out.println(a[i]);
//		}
		
//		System.out.println("Enter your key...");
//		int key=sc.nextInt();
//		int x=Arrays.binarySearch(a, key);
//		System.out.println("element found at "+x);
		
//		System.out.println("Enter your key...");
//		int key=sc.nextInt();
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]==key)
//			{
//				System.out.println("Key found in "+i+" index position");
//			}
//		}
		
		/*
		 * 2D Array
		 *        0 1 2
		 * 0-->   1,2,3
		 * 1-->   4,5,6
		 * 2-->   7,8,9
		 *  
		 *  data-type variable[][]=new data-type[row][column];
		 * 
		 */
//		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
//		for(int i=0;i<3;i++)
//		{
//			for(int j=0;j<3;j++)
//			{
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
		
//		int a[][]=new int[3][2];
//		a[0][0]=1;
//		a[0][1]=2;
//		a[1][0]=8;
//		a[1][1]=4;
//		a[2][0]=9;
//		a[2][1]=2;
//		for(int i=0;i<3;i++)
//		{
//			for(int j=0;j<2;j++)
//			{
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row and column size...");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int a[][]=new int [row][col];
		int b[][]=new int [row][col];
		System.out.println("Enter First array elements...");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter second array elements...");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("First array elemets are...");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("second array elemets are...");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		int c[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		
		System.out.println("The added array is...");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
