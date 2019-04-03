
class Num
{
    int index;
    double sum;
    double [] list=new double[9000000];
    Num(int i)
    {
        sum=i;
        index=0;
        for(int j=0;j<9000000;j++)
        {
        	list[j]=2.0;
        }
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
        	double s2=0.0;
        	int temp=Obj.index;
        	int temp2=temp+9000;
        	try
        	{
        		for(int i=temp;i<temp2;i++)
            	{
            		s2=s2+Obj.list[i];
            	}
        	}
        	catch(Exception e){}
            
            Obj.index+=9000;
            Obj.sum=Obj.sum+s2;
            System.out.println(Thread.currentThread().getName()+" :  temp_sum:"+ s2);
            System.out.println(Thread.currentThread().getName()+" :  Total_sum:"+ Obj.sum);
        }
        
        
         /* //  without sync  
            Obj.sum=Obj.sum+1;
            System.out.println(Thread.currentThread().getName()+" :      "+ Obj.sum);
        */
        
	}
}
class third
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
