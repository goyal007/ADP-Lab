import java.util.*;
import java.lang.Math;
class RangeException extends RuntimeException
{
	RangeException (String msg)
	{
		super(msg);
	}
}
class Second
{
	public static double add(String[] s)
	{
		double sum=0.0;
		double temp=0.0;
		int l=s.length;
		int c=0;
		System.out.println(l);
			try
			{
				for(int i=0;i<l;i++)
				{
					temp=Double.parseDouble(s[i]);
					if(temp<0.0 || temp>1.0)
						throw new RangeException("Range is not b/w 0 and 1 for "+temp);

					sum=sum+temp;
					c++;
				}

				
			}
			catch(NumberFormatException n)
			{
				n.printStackTrace();
			}
			catch(RangeException r)
			{
				r.printStackTrace();
			}
			finally
			{
				System.out.println("Thanks for using the Program");
				if(c==l)
				{
					return sum;
				}
				else
				{
					return 10000.0;
				}
				
			}


	}
	public static void main(String[] args) 
	{
		String[] s=new String[5];
		String str;
		System.out.println("Enter strings :");
		for(int i=0;i<5;i++)
		{
			Scanner sc=new Scanner(System.in);
			
			str=sc.next();
			s[i]=str;
		}
		double y=add(s);
		if(y!=10000.0)
		System.out.println("Sum is  :"+y);
	}
}