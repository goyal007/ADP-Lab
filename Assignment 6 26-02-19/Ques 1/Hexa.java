import java.util.*;
import java.lang.Math;

class HexaNot extends RuntimeException
{
	HexaNot(String msg)
	{
		super(msg);
	}
}

class Hexa
{
	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			String t=sc.next();
			int l=t.length();
			//System.out.println(l);
			
				try
				{
					int c=0;
					for(int i=0;i<l;i++)
					{
						char c1=t.charAt(i);
						if((c1>='0' && c1<='9') || (c1>='A' && c1<='F')|| (c1>='a' && c1<='f'))
						{

						}
						else
						{
							//System.out.println(i);
							c++;
							break;
						}
					}
					if(c!=0)
					throw new HexaNot("not a hexadecimal");
					else
					System.out.println("it is a hexadecimal number");
				}
				catch(HexaNot ex)
				{
					ex.printStackTrace();
				}
				finally
				{
					System.out.println("Input string is:"+t);
				}
			
			
	}
}