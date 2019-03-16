import java.util.*;
import java.util.Random;
class Generate1 extends Thread
{
	private int num,s;
	public  void run()
	{
		//System.out.println(Thread.currentThread().getName()+":");
		try
        { 
            Thread.sleep(500); 
            System.out.println("5:Current Thread: "+ Thread.currentThread().getName()); 
        } 
  		catch(Exception ex) 
        { 
            System.out.println("Exception has" +  " been caught" + ex); 
        } 
		for(int i=1;i<num;i++)
		{
			
			if(num%i==0)
			{
				s+=i;
			}
		}
		
	}
	Generate1 ()
	{
		Random rt=new Random();
		num=rt.nextInt(500);
		num=220;
	}
	Generate1 (int num)
	{
		this.num=num;
	}
	int sum()
	{
		return s;
	}
	int getnum()
	{
		return num;
	}
	
}

class Generate2 extends Thread
{
	private int num,s;
	public  void run()
	{
		//System.out.println(Thread.currentThread().getName()+":");
		try
        { 
            Thread.sleep(500); 
            System.out.println("6:Current Thread: "+ Thread.currentThread().getName()); 
        } 
  		catch(Exception ex) 
        { 
            System.out.println("Exception has" +  " been caught" + ex); 
        } 
		for(int i=1;i<num;i++)
		{
			
			if(num%i==0)
			{
				s+=i;
			}
		}
		
	}
	Generate2 ()
	{
		Random rt=new Random();
		num=rt.nextInt(500);
		num=284;
	}
	Generate2 (int num)
	{
		this.num=num;
	}
	public int sum()
	{
		return s;
	}
	int getnum()
	{
		return num;
	}
	
}
class InterThread
{
	public static void main(String[] args) 
	{
		int a,b;
		//Scanner sc=new Scanner(System.in);
		//Sysytem.out.println("enter two number");
		//a=sc.nextInt();
		//b=sc.nextInt();
		System.out.println("1:Current Thread: "+ Thread.currentThread().getName()); 
		Generate1 t1=new Generate1();
		Generate2 t2=new Generate2();
		//Generate1 t1=new Generate1(220);
		//Generate t2=new Generate(284);
		t1.setName("CSA");
		t2.setName("CSB");
		t1.start();
		t2.start();

		try
        { 
            System.out.println("2:Current Thread: "+ Thread.currentThread().getName()); 
            t1.join(); 
        } 
        catch(Exception ex) 
        { 
            System.out.println("Exception has " + "been caught" + ex); 
        } 

		try
        { 
            System.out.println("3:Current Thread: "+ Thread.currentThread().getName()); 
            t2.join(); 
        } 
        catch(Exception ex) 
        { 
            System.out.println("Exception has " + "been caught" + ex); 
        } 


		System.out.println("4:Current Thread: "+ Thread.currentThread().getName()); 
		
		a=t1.getnum();
		b=t2.getnum();
		int n1=t1.sum();
		int n2=t2.sum();
		System.out.println("first number generated->" + a); 
		System.out.println("sec number generated->" + b); 

		if(n1==b && n2==a)
		{
			System.out.println("It is amicable");
		}
		else
		{
			System.out.println("It is not amicable");
		}

	}
}