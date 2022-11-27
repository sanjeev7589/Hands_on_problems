package Practice;

import java.util.Scanner;

public class palindrome_or_not {
public static void main(String[] args)
{
	palindrome_or_not palindrome=new palindrome_or_not();
	//palindrome.palindromeornot();
	//palindrome.ignore_cases();
	//palindrome.replace_non_palidrome();
	palindrome.remove_non_palindrome();
}
void palindromeornot()
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the String:");
	String string =s.next();
	char [] ch = string.toCharArray();
	char [] ch1 = new char[ch.length];
	int j=ch1.length-1;
	for(int i=0; i<ch.length; i++)
	{
		ch1[j]=ch[i];
		j--;
	}
	String new_string = String.copyValueOf(ch1);
	if(string.equals(new_string))
	{
		System.out.print("It is an palindrome");
	}
	else
	{
		System.out.print("Not an palindrome");
	}
}
void ignore_cases()
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the String");
	String string =s.next();
	char [] ch = string.toCharArray();
	char [] ch1 = new char[ch.length];
	int j=ch1.length-1;
	for(int i=0; i<ch.length; i++)
	{
		ch1[j]=ch[i];
		j--;
	}
	String new_string = String.copyValueOf(ch1);
	if(string.equalsIgnoreCase(new_string))
	{
		System.out.print("It is an palindrome");
	}
	else
	{
		System.out.print("Not an palindrome");
	}	
}
void replace_non_palidrome()
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the String:");
	String string =s.next();
	char [] ch = string.toCharArray();
	char [] ch1 = new char[ch.length];
	int j=ch1.length-1;
	for(int i=0; i<ch.length; i++)
	{
		if(ch[i]!=ch[j])
		{
			ch1[i]='*';
			ch1[j]='*';
		}
		else
		{
			ch1[i]=ch[i];
		}
		j--;
	}
	String new_string = String.copyValueOf(ch1);
	System.out.println(new_string);
}
void remove_non_palindrome()
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the String:");
	String string =s.next();
	char [] ch = string.toCharArray();
	int count=0;
	//char [] ch1 = new char[ch.length];
	int j=ch.length-1;
	for(int i=0; i<ch.length; i++)
	{
		if(ch[i]==ch[j])
		{
			count++;
		}
		j--;
	}
	//System.out.print(count);
	j=ch.length-1;
	char [] ch1 = new char[count];
	int l=0;
	for(int k=0; k<ch.length; k++)
	{
		if(ch[k]==ch[j])
		{
			ch1[l]=ch[k];
			l++;
		}
		j--;
	}
	String new_string = String.copyValueOf(ch1);
	System.out.println(new_string);
}
}
