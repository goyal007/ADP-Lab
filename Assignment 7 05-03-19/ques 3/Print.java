class Sample     ///   a shared resouce on the basis of which sync will happen
{

}
class even extends Thread
{
	Sample s=null;
	even(Sample s)
	{
		this.s=s;
	}
	public void run()
	{
		try
		{
			Thread.sleep(100);   // this sleep is to run first even(2) after odd i.e. 1
		}
		catch(InterruptedException ex)
		{
			System.out.println(ex.getMessage());
		}
		synchronized(s)
		{
		for(int i=2;i<=1000;i+=2)
		{
			System.out.print("\t\t"+Thread.currentThread().getName()+":");
			System.out.println(i);
			try   //   wait and sleep must be write in try catch
			{
				s.notify();
				Thread.sleep(10);                           //notify and wait will can be written directly when sync is b/w two methods in same class
				s.wait();
			}
			catch(InterruptedException ex)
			{
				System.out.println("error");
			}
		}
		s.notify();    // this is used to remove the waiting condition at the end (when both threads are waiting)
		}
	}
}
class odd extends Thread
{
	Sample s=null;
	odd(Sample s)
	{
		this.s=s;
	}
	public void run()
	{
		synchronized(s)
		{
		for(int i=1;i<=1000;i+=2)
		{
			System.out.print(Thread.currentThread().getName()+":");
			System.out.println(i);
			try
			{
				s.notify();
				Thread.sleep(10);
				s.wait();
			}
			catch(InterruptedException ex)
			{
				System.out.println("error");
			}
		}
		s.notify();
		}
	}
}
class Print
{
	public static void main(String[] args) 
	{
		Sample s=new Sample();    // s is shared lock
		even e1=new even(s);
		odd o1=new odd(s);
		e1.setName("even thread");
		o1.setName("odd thread");
		e1.start();
		o1.start();
	}
}
