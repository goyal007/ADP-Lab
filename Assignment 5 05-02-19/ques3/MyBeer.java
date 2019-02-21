import java.util.*;
import java.lang.Math;

class MyBeer
{
	public static void main(String[] args) 
	{
			Scanner sc=new Scanner (System.in);
			int T=Integer.parseInt(args[0]); 
			int arr[]=new int[T];
			int arr2[]=new int[T];
			for(int i=0;i<T;i++)
			{
				arr[i]=i;
			}
			for(int i=0;i<T;i++)
			{
				arr2[i]=-2;
			}
			Random rand = new Random();
			int count=0;
			for (int i=0;i<1000;i++) 
			{
				double c;
				double ans;
				c=0.0;
				for (int k=0;k<T;k++)
				{								
					int n0;
					while(true)
					{
						n0 = rand.nextInt(T);
						int c2=0;
						for(int p=0;p<T;p++)
						{
							if(arr2[p]==n0)
							{
								c2=1;
								break;
							}
						}

						if(c2==0)
						{
							System.out.print("number:"+n0+" ");
							arr2[k]=n0;
							if(arr2[k]==arr[k] )
							{
								c++;
							}
							break;
						}
					}
					
					
				}
				for(int p=0;p<T;p++)
				{
					arr2[p]=-2;
				}
				System.out.println(" ");
				if(c!=0)
					count++;
				ans=c*1.0/T;
				System.out.println(ans);
			}
			double yp=1.0*count/1000;
			System.out.println("the fraction of times that at least one guest gets their original beer: "+yp);
			
	}
}
