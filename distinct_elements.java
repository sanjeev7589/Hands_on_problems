package Practice;

public class distinct_elements {
public static void main(String[] args)
{
	distinct_elements de = new distinct_elements();
	//de.dis_ele();
	//de.sort_ascen();
	//de.sort_descen();
	//de.dis_ele_star();
	de.dis_ele_star2();
}
void dis_ele()
{
	int i=0;
	int j=0;
	int [] a= {7,9,1,3,4,5,6,3,6};
	int count=0;
	for(i=0; i<a.length; i++)
	{
		for(j=i+1; j<a.length; j++)
		{
			if(a[i]==a[j] && a[i]!=-1)
			{
				a[j]=-1;
				a[i]=-1;
				count =count+2;
			}
		}
	}
	
	int [] new_array=new int[a.length-count];
	int k=0;
	for(i=0; i<a.length; i++)
	{
		if(a[i]!=-1)
		{
			new_array[k] = a[i];
			k++;
		}	
	}
	for(int print:new_array)
	{
		System.out.print(print + " ");
	}
}
void sort_ascen()
{
	int [] a= {7,9,1,3,4,5,6,3,6};
	int i=0;
	int j=0;
	int temp=0;
	for(i=0; i<a.length; i++ )
	{
		int max=a[0];
		for(j=1; j<a.length; j++)
		{
			if(max>a[j])
			{
				temp=a[j];
				a[j] = a[j-1];
				a[j-1]=temp;
				max=a[j];
			}
			else
			{
				max=a[j];
			}
		}
	}
	int count=0;
	for(i=0; i<a.length; i++)
	{
		for(j=i+1; j<a.length; j++)
		{
			if(a[i]==a[j] && a[i]!=-1)
			{
				a[j]=-1;
				a[i]=-1;
				count =count+2;
			}
		}
	}
	
	int [] new_array=new int[a.length-count];
	int k=0;
	for(i=0; i<a.length; i++)
	{
		if(a[i]!=-1)
		{
			new_array[k] = a[i];
			k++;
		}	
	}
	for(int print:new_array)
	{
		System.out.print(print + " ");
	}
}
void sort_descen()
{
	int [] a= {7,9,1,3,4,5,6,3,6};
	int i=0;
	int j=0;
	int temp=0;
	for(i=0; i<a.length; i++ )
	{
		int min=a[0];
		for(j=1; j<a.length; j++)
		{
			if(min<a[j])
			{
				temp=a[j];
				a[j] = a[j-1];
				a[j-1]=temp;
				min=a[j];
			}
			else
			{
				min=a[j];
			}
		}
	}
	int count=0;
	for(i=0; i<a.length; i++)
	{
		for(j=i+1; j<a.length; j++)
		{
			if(a[i]==a[j] && a[i]!=-1)
			{
				a[j]=-1;
				a[i]=-1;
				count =count+2;
			}
		}
	}
	
	int [] new_array=new int[a.length-count];
	int k=0;
	for(i=0; i<a.length; i++)
	{
		if(a[i]!=-1)
		{
			new_array[k] = a[i];
			k++;
		}	
	}
	for(int print:new_array)
	{
		System.out.print(print + " ");
	}
}
void dis_ele_star()
{
	int i=0;
	int j=0;
	char [] a= {'7','9','1','3','4','5','6','3','6'};
	for(i=0; i<a.length; i++)
	{
		for(j=i+1; j<a.length; j++)
		{
			if(a[i]==a[j] && a[i]!='*')
			{
				a[j]='*';
				a[i]='*';
			}
		}
	}
	for(char print:a)
	{
		System.out.print(print + " ");
	}
}
void dis_ele_star2()
{
	int i=0;
	int j=0;
	char [] a= {'7','9','1','3','4','5','6','3','6'};
	int count=0;
	for(i=0; i<a.length; i++)
	{
		for(j=i+1; j<a.length; j++)
		{
			if(a[i]==a[j])
			{
				count++;
			}
		}
	}
	char [] b=new char[count];
	
	j=0;
	int k=0;
	for(i=0; i<a.length; i++)
	{
		for(j=i+1; j<a.length; j++)
		{
			if(a[i]==a[j])
			{
				b[k]=a[i];
				k++;
			}
		}
	}
	
	for(i=0; i<a.length; i++)
	{
		count=b.length;
		for(j=0; j<b.length;j++)
		{
			if(a[i]!=b[j])
			{
				count--;
			}
		}
		if(count==0)
		{
			a[i]='*';
		}
	}
	for(char print:a)
	{
		System.out.print(print + " ");
	}
}
}
