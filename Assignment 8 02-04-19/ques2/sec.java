
class Num
{
    int sum;
    Num()
    {
    	
    }
    Num(int i)
    {
        sum=i;
    }
    //public String toString() //if direct want to use SOP(Obj)
   // {
    //    return String.valueOf(sum);
    //}
}
class Mythread extends Thread
{ 
    Num Obj;
	Mythread(Num Obj)
	{
        this.Obj=Obj;
	}
	public void run()
	{
	
        synchronized(Obj)
        {   
            Obj.sum=Obj.sum+1;
            System.out.println(Thread.currentThread().getName()+" :      "+ Obj.sum);
        }
        
        
         /* //  without sync  
            Obj.sum=Obj.sum+1;
            System.out.println(Thread.currentThread().getName()+" :      "+ Obj.sum);
        */
        
	}
}
class sec
{
	public static void main(String[] args) 
	{
		//int z=0;
		Num Obj=new Num(0);
		Mythread m[]=new Mythread[1000];
		for (int i=0;i<1000;i++)
		{
            m[i]=new Mythread(Obj);
		}
		for (int i=0;i<1000;i++)
		{
            m[i].start();
		}
		try
		{
		    for (int i=0;i<1000;i++)
		    {
                m[i].join();
		    }
		    
		}
		catch(InterruptedException ex)
		{
		    ex.printStackTrace();
		 }
		 System.out.println("final sum= "+Obj.sum);
	}
}
