package Practice;

import java.util.Scanner;

public class Binary_0r_Not {
	public static void main(String[] args)
	{
		Binary_0r_Not binary =new Binary_0r_Not();
		binary.arithmetic_operators();
		binary.array();
	}
	void arithmetic_operators()
	{
		boolean flag=true;
		int digit=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = s.nextInt();
		while(num>0)
		{
			digit=num%10;
			if(digit!=0 && digit!=1)
			{
				flag=false;
			}
			num=num/10;
		}
		if(flag==false)
		{
			System.out.print("Not an binary");
		}
		else
		{
			System.out.print("Binary");
		}	
	}
	void array()
	{
		boolean flag=true;
		Scanner s=new Scanner(System.in);
		int [] arr=new int[5];
		for(int i=0; i<5;i++)
		{
			arr[i] = s.nextInt();
		}
		for(int print:arr)
		{
			System.out.print(print);
		}
	}
}
