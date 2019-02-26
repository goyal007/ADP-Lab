import java.util.*;
import java.lang.Math;
class sin extends Thread
{
	public void run()
	{
		for(int i=0;i<=360;i++)
		{
			System.out.println("sin["+i+"]="+Math.sin(Math.toRadians(i)));
			try
			{
				Thread.sleep(10);
			}
			catch(InterruptedException e)
			{
				System.out.println("error");
			}
			

		}
	}
}
class cos extends Thread
{
	public void run()
	{
		for(int i=0;i<=360;i++)
		{
			System.out.println("cos["+i+"]="+Math.cos(Math.toRadians(i)));
			try
			{
				Thread.sleep(10);
			}
			catch(InterruptedException e)
			{
				System.out.println("error");
			}
		}
	}
}
class Maths
{
	public static void main(String[] args) 
	{
			sin s=new sin();
			cos c=new cos();
			s.start();
			c.start();
	}
}