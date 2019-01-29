import java.util.*;
interface Function
{
	public abstract int evaluate(int parameter);
}
class half implements Function
{
	public int evaluate(int parameter)
	{
		return (parameter/2);
	}
	
}

class third1
{


	public static Integer[] helper(Integer[] a)
	{
		half h = new half();
		for(int i=0;i<a.length;i++)
		{
			a[i] = h.evaluate(a[i]);
		}
		return a;
	}


	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size:");
		int size = sc.nextInt();
		Integer [] a=new Integer[size];
		for(int i=0;i<size;i++)
		{	
			System.out.println("enter value:");
			int val = sc.nextInt();
			a[i]=val;
		}
		a = helper(a);
		/*half obj=new half();
		for(int i=0;i<size;i++)
		{	
			a[i]=obj.evaluate(a[i]);
		}
		*/
		System.out.println("new values:");
		for(int i=0;i<size;i++)
		{	
			System.out.println(a[i]);
			
		}
	}
}
