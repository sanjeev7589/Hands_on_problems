package Practice;

import java.util.Scanner;

public class alternative_digits {
public static void main(String[] args)
{
	alternative_digits ad =new alternative_digits();
	ad.add_zeros();
}
void add_zeros()
{
	int no=2020;
	int copy_no=no;
	int count=0;
	while(copy_no!=1)
	{
		copy_no/=10;
		count++;
	}
	int value=0;
	int print=0;
	String s="";
	while(no!=0)
	{
		value = (int)Math.pow(10, count);
		print=(no/value)*10;
		s=s+Integer.toString(print);		
		no%=value;
		count--;
	}
	int result = Integer.parseInt(s);
	System.out.print(result);	
}
}
