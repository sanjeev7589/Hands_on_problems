package Practice;

public class swap {
public static void main(String[] args)
{
	swap s = new swap();
	//s.first_last();
	s.swap_using_array();
}
void first_last()
{
	int value=12345;
	int copy_value=value;
	int count=0;
	if(value>=10)
	{
	while(value!=0)
	{
		value/=10;
		count++;
	}
	int ten=10;
	for(int i=1; i<count-1;i++)
	{
		ten*=10;
	}
	int f_d=copy_value/ten;
	int l_d=copy_value%ten;
	int reverse = ((l_d%10)*ten)+((l_d/10)*10)+(f_d);
	System.out.println(reverse);	
	}
	else
	{
		System.out.println(value);
	}
}
void swap_using_array()
{
	int value=12345;
	String string = Integer.toString(value);
	//System.out.println(string);
	char [] ch = string.toCharArray();
	char temp=ch[0];
	for(int i=0; i<ch.length; i++)
	{
		if(i==0)
			ch[i]=ch[ch.length-1];
		if(i==ch.length-1)
			ch[i]=temp;
			
	}
	String reverse = String.copyValueOf(ch);
	System.out.println(reverse);	
}
}
