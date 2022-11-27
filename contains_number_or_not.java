package Practice;

import java.util.Scanner;

public class contains_number_or_not {
public static void main(String[] args)
{
	boolean flag=true;
	Scanner s =new Scanner(System.in);
	System.out.println("Enter the string:");
	String value = s.next();
	//sSystem.out.println(value);
	char[] ch = value.toCharArray();
	for(int i=0; i<ch.length; i++)
	{
		if(!(Character.isDigit(ch[i])))
		{
			flag = false;
			break;
		}
	}
	if(flag==false)
	{
		System.out.print("Contains other than numbers");
	}
	else
	{
		System.out.print("Contains only numbers");
	}
	
}
}
