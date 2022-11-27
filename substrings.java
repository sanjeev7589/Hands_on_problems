package Practice;

import java.util.Scanner;

public class substrings {
public static void main(String[] args)
{
	substrings sub = new substrings();
	//sub.ignore_cases();	
	sub.delete_substring();
}
void ignore_cases()
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the string: ");
	String string=s.nextLine();
	String new_string = string.replaceAll("\\s","");
	String sub_string="";
	String sub_string1="";
	
	for(int i=0; i<new_string.length()-1; i++)
	{
		if(new_string.substring(i,i+2)!=" ")
		{
		 sub_string =new_string.substring(i,i+2);
		}
		for(int j=i+2; j<new_string.length()-1; j++)
		{
			if(new_string.substring(j,j+2)!=" ")
			{
				sub_string1 =new_string.substring(j,j+2);
			}
		 
			if(sub_string.equalsIgnoreCase(sub_string1))
			{
				System.out.println(sub_string + " occurs twice");
			}
		}
	}	
}
void delete_substring()
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the string: ");
	String string=s.nextLine();
	String new_string = string.replaceAll("\\s","");
	String sub_string="";
	String sub_string1="";
	for(int i=0; i<new_string.length()-1; i++)
	{
		if(new_string.substring(i,i+2)!=" ")
		{
		 sub_string =new_string.substring(i,i+2);
		}
		for(int j=i+2; j<new_string.length()-1; j++)
		{
			if(new_string.substring(j,j+2)!=" ")
			{
				sub_string1 =new_string.substring(j,j+2);
			}
		 
			if(sub_string.equals(sub_string1))
			{
				
			}
		}
	}	
}
}
