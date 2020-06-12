package com.wipro.flowcontrolstatements;

public class Exp6 {

	public static void main(String[] args) {
		int a=args.length,i;
		if(a==0)
		{
			System.out.println("No Values");
		}
		else
		{
			System.out.print(args[0]);
			for(i=1;i<a;i++)
			{
				System.out.print(","+args[i]);
			}
		}
	}
}
