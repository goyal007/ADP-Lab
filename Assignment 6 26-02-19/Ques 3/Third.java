/* 
	if we don't write try-catch blocks in the functions a and b then implicit ducking (runtime)takes place 
	and exception will be handled in the calling function i.e main
	note:
	if there is no try catch in main too then it will be handled by jvm as there is no catch mechanism in main
	
*/



class Third
{
	public static void a()
	{
		try
			{
				b();
			}
			catch(ArrayIndexOutOfBoundsException ex)
			{
				System.out.println("ArrayIndexoutOfBoundsException in a()");
				throw new ArrayIndexOutOfBoundsException();
			}
	}
	public static void b()
	{
		try
			{
				c();
			}
			catch(ArrayIndexOutOfBoundsException ex)
			{
				System.out.println("ArrayIndexoutOfBoundsException in b()");
				throw new ArrayIndexOutOfBoundsException();
			}
	}
	public static void c()
	{
		try
			{
				d();
			}
			catch(ArrayIndexOutOfBoundsException ex)
			{
				System.out.println("ArrayIndexoutOfBoundsException in c()");
				throw new ArrayIndexOutOfBoundsException();
			}
	}
	public static void d()
	{
		int arr[]=new int[10];
		try
		{
				for(int i=0;i<10;i++)
				{
					arr[i]=i*2;
				}
				for(int i=0;i<=15;i++)
				{
					System.out.println("array element "+arr[i]);
				}
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("ArrayIndexoutOfBoundsException in d()");
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	public static void main(String[] args) 
	{
			try
			{
				a();
			}
			catch(ArrayIndexOutOfBoundsException ex)
			{
				System.out.println("ArrayIndexoutOfBoundsException in main()");
			}
	}
}
