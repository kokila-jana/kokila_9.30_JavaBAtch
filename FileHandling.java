package morning;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) throws IOException 
	{
//		File f=new File("C:\\Users\\manojana\\OneDrive\\Desktop\\kk.txt");
//		if(f.createNewFile())
//		{
//			System.out.println("File created...");
//		}
//		else
//		{
//			System.out.println("File already created..");
//		}
		
		
//		File f=new File("C:\\Users\\manojana\\OneDrive\\Desktop\\kk.txt");
//		FileWriter fw=new FileWriter(f);
//		fw.write("India celebrates its 80th Independence Day on Saturday, August 15, 2026,\n marking 79 completed years of freedom from British colonial rule.\n The main national event takes place at the historic Red Fort in New Delhi,\n featuring the traditional flag hoisting\n and address by the Prime Minister.");
//		fw.append("\nI love India");
//		fw.flush();
//		fw.close();
//		System.out.println("writed...");
		
		
//		File f=new File("C:\\Users\\manojana\\OneDrive\\Desktop\\kk.txt");
//		Scanner sc=new Scanner(f);
//		while(sc.hasNext())
//		{
////			String s=sc.next();
//			String s=sc.nextLine();
//			System.out.println(s);
//		}
//		
		File f=new File("C:\\Users\\manojana\\OneDrive\\Desktop\\kk.txt");
		if(f.delete())
		{
			System.out.println("File deleted...");
		}
		else
		{
			System.out.println("File already deleted..");
		}
		
		
		
	}

}
