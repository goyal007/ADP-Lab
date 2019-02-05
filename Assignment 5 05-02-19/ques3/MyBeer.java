import java.util.*;
import java.lang.Math;
class helper
{
	private int fact(int x)
	{
		int ans=1;
		for(int i=1;i<=x;i++)
		{
			ans*=i;
		}
		return ans;
	}
	 double probability(int n)
	{
		double ans=0.0;
		for (int i=2;i<=n;i++) 
		{
			ans=ans+Math.pow(-1,i)/fact(i);
		}
		return (1.0-ans);
	}
}
class MyBeer
{
	public static void main(String[] args) 
	{
			Scanner sc=new Scanner (System.in);
			int Total_simul=Integer.parseInt(args[0]); 
			helper hp=new helper();
			
			for (int i=0;i<Total_simul;i++) 
			{
				System.out.println("enter number of guests:");
				int n=sc.nextInt();
				double ans=hp.probability(n);
				System.out.println(ans);
			}
	}
}
