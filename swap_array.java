package Practice;
public class swap_array {
public static void main(String[] args)
{
	swap_array sa = new swap_array();
	//sa.swap_array_equal_size();
	//sa.swap_array_odd_elements();
	//sa.swap_array_even_elements();
	
}
void swap_array_equal_size()
{
	int []a= {1,2,5};
	int []b= {3,6,7};
	int []temp= new int[a.length];
	int i=0;
	for(i=0; i<temp.length;i++)
	{
		temp[i]=a[i];
		a[i]=b[i];
		b[i]=temp[i];
	}
	System.out.print("a:");
	for(int print:a)
	{
		System.out.print(print + " ");
	}
	System.out.println();
	System.out.print("b:");
	for(int print:b)
	{
		System.out.print(print+ " ");
	}
}
void swap_array_odd_elements()
{
	int []a= {1,2,5};
	int []b= {3,6,7};
	int []temp= new int[a.length];
	int i=0;
	for(i=0; i<temp.length;i++)
	{
		if(a[i]%2!=0 && b[i]%2!=0)
		{
			temp[i]=a[i];
			a[i]=b[i];
			b[i]=temp[i];
		}
	}
	System.out.print("a:");
	for(int print:a)
	{
		System.out.print(print + " ");
	}
	System.out.println();
	System.out.print("b:");
	for(int print:b)
	{
		System.out.print(print+ " ");
	}
}
void swap_array_even_elements()
{
	int []a= {1,2,5};
	int []b= {3,6,7};
	int []temp= new int[a.length];
	int i=0;
	for(i=0; i<temp.length;i++)
	{
		if(a[i]%2==0 && b[i]%2==0)
		{
			temp[i]=a[i];
			a[i]=b[i];
			b[i]=temp[i];
		}
	}
	System.out.print("a:");
	for(int print:a)
	{
		System.out.print(print + " ");
	}
	System.out.println();
	System.out.print("b:");
	for(int print:b)
	{
		System.out.print(print+ " ");
	}
}

}
