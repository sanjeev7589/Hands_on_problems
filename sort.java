package Practice;

import java.util.Scanner;

public class sort {
public static void main(String[] args)
{
	sort s = new sort();
	//s.merge();
	//s.merge_sort_ascen();
	//s.merge_sort_descen();
	s.remove_duplicate_unsort();
	//s.remove_duplicate_sort();
}
void merge()
{
	int [] a= {1,3,3,5};
	int [] b= {2,4,6,6};
	int [] merge_array=new int[a.length+b.length];
	int j=0;
	for(int i=0; i<merge_array.length; i++)
	{
		if(i<a.length)
		{
			merge_array[i] = a[i];
		}
		else if(i>=a.length)
		{
			merge_array[i]=b[j];
			j++;
		}	
	}
	for(int print:merge_array)
	{
		System.out.print(print + " ");
	}
}
void merge_sort_ascen()
{
	int [] a= {1,3,3,5};
	int [] b= {2,4,6,6};
	int [] merge_array=new int[a.length+b.length];
	int j=0;
	int i=0;
	for( i=0; i<merge_array.length; i++)
	{
		if(i<a.length)
		{
			merge_array[i] = a[i];
		}
		else if(i>=a.length)
		{
			merge_array[i]=b[j];
			j++;
		}	
	}
	int temp=0;
	for(i=0; i<merge_array.length; i++ )
	{
		int max=merge_array[0];
		for(j=1; j<merge_array.length; j++)
		{
			if(max>merge_array[j])
			{
				temp=merge_array[j];
				merge_array[j] = merge_array[j-1];
				merge_array[j-1]=temp;
				max=merge_array[j];
			}
			else
			{
				max=merge_array[j];
			}
		}
	}
	for(int print:merge_array)
	{
		System.out.print(print+ " ");
	}
}
void merge_sort_descen()
{
	int [] a= {1,3,3,5};
	int [] b= {2,4,6,6};
	int [] merge_array=new int[a.length+b.length];
	int j=0;
	int i=0;
	for( i=0; i<merge_array.length; i++)
	{
		if(i<a.length)
		{
			merge_array[i] = a[i];
		}
		else if(i>=a.length)
		{
			merge_array[i]=b[j];
			j++;
		}	
	}
	int temp=0;
	for(i=0; i<merge_array.length; i++ )
	{
		int min=merge_array[0];
		for(j=1; j<merge_array.length; j++)
		{
			if(min<merge_array[j])
			{
				temp=merge_array[j];
				merge_array[j] = merge_array[j-1];
				merge_array[j-1]=temp;
				min=merge_array[j];
			}
			else
			{
				min=merge_array[j];
			}
		}
	}
	for(int print:merge_array)
	{
		System.out.print(print+ " ");
	}
}
void remove_duplicate_unsort()
{
	int [] a= {1,4,5,6};
	int [] b= {2,4,6,6};
	int [] merge_array=new int[a.length+b.length];
	int j=0;
	int i=0;
	for( i=0; i<merge_array.length; i++)
	{
		if(i<a.length)
		{
			merge_array[i] = a[i];
		}
		else if(i>=a.length)
		{
			merge_array[i]=b[j];
			j++;
		}	
	}	
	int count=0;
	for(i=0; i<merge_array.length; i++)
	{
		for(j=i+1; j<merge_array.length; j++)
		{
			if(merge_array[i]==merge_array[j] && merge_array[i]!=-1)
			{
				merge_array[j]=-1;
				count++;
			}
		}
	}
	
	int [] new_array=new int[merge_array.length-count];
	int k=0;
	for(i=0; i<merge_array.length; i++)
	{
		if(merge_array[i]!=-1)
		{
			new_array[k] = merge_array[i];
			k++;
		}	
	}
	for(int print:new_array)
	{
		System.out.print(print + " ");
	}
}
void remove_duplicate_sort()
{
	int [] a= {1,3,3,5};
	int [] b= {2,4,6,6};
	int [] merge_array=new int[a.length+b.length];
	int j=0;
	int i=0;
	for( i=0; i<merge_array.length; i++)
	{
		if(i<a.length)
		{
			merge_array[i] = a[i];
		}
		else if(i>=a.length)
		{
			merge_array[i]=b[j];
			j++;
		}	
	}
	int temp=0;
	for(i=0; i<merge_array.length; i++ )
	{
		int max=merge_array[0];
		for(j=1; j<merge_array.length; j++)
		{
			if(max>merge_array[j])
			{
				temp=merge_array[j];
				merge_array[j] = merge_array[j-1];
				merge_array[j-1]=temp;
				max=merge_array[j];
			}
			else
			{
				max=merge_array[j];
			}
		}
	}
	int count=0;
	for(i=0; i<merge_array.length; i++)
	{
		for(j=i+1; j<merge_array.length; j++)
		{
			if(merge_array[i]==merge_array[j])
			{
				count++;
			}
		}
	}
	j=0;
	int [] new_array=new int[merge_array.length-count];
	for(i=0; i<merge_array.length-1; i++)
	{
		if(merge_array[i]!=merge_array[i+1])
		{
			new_array[j]=merge_array[i];
			j++;
		}
	}
	new_array[new_array.length-1]=merge_array[merge_array.length-1];
	for(int print:new_array)
	{
		System.out.print(print + " ");
	}
}
}
