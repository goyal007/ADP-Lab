import java.util.*;
class Shared
{
	int bal;
	Shared()
	{
		bal=600;
	}
	Shared(int bal)
	{
		this.bal=bal;
	}
}
class Father extends Thread
{
	Shared s=null;
	Father(Shared s)
	{
		this.s=s;
	}
	public void run()
	{
		//setName("Father thread");
		Random rand = new Random();
		while(true)
		{
			synchronized(s)
			{
				while(s.bal<=2000)
				{
					int x=rand.nextInt(200)%200+1;
					s.bal+=x;
					System.out.println("amount deposited by father is:"+x);
					System.out.println("\t\t\t\t  Acc Balance:"+s.bal);
					try
					{
						sleep(200);
					}
					catch(InterruptedException ex)
					{
						System.out.println("error");
					}
				}

				try
				{
					s.notify();
					Thread.sleep(50);
					s.wait();
				}
				catch(InterruptedException ex)
				{
					System.out.println("error");
				}
			}
		}
		
	}
}
class Son extends Thread
{
	Shared s=null;
	Son(Shared s)
	{
		this.s=s;
	}
	public void run()
	{
		try
		{
			Thread.sleep(100);    //sleep as first parent should be run
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		Random rand = new Random();
		while(true)
		{
			synchronized(s)
			{
				while(s.bal>=500)
				{
					int x=rand.nextInt(150)%150+1;
					s.bal-=x;
					System.out.println("amount withdrawl by son is:"+x);
					System.out.println("\t\t\t\t  Acc Balance:"+s.bal);
					try
					{
						Thread.sleep(200);
					}
					catch(InterruptedException ex)
					{
						System.out.println("error");
					}
				}

				try
				{
					s.notify();
					Thread.sleep(50);
					s.wait();
				}
				catch(InterruptedException ex)
				{
					System.out.println("error");
				}
			}
		}
	}
}
class Account
{
	public static void main(String[] args) 
	{
			Shared s=new Shared();
			Father t1=new Father(s);
			Son t2=new Son(s);
			t1.setName("Father thread");
			t2.setName("Son thread");
			t1.start();
			t2.start();

			// it is always better to join
			try
			{
				t1.join();
				t2.join();
			}
			catch(InterruptedException ex)
			{
				System.out.println(ex.getMessage());
			}
	}
}