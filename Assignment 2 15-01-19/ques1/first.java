class first
{
	private int day,month,year;
	public  first()
	{
		day=12;
		month=3;
		year=1993;
	}
	public  first(int day1,int month1,int year1)
	{
		day=day1;
		month=month1;
		year=year1;
	}
	public  first(first temp)
	{
		day=temp.day;
		month=temp.month;
		year=temp.year;
	}
	public void show()
	{
		System.out.println(day);
		System.out.println(month);
		System.out.println(year);
	}
	public static void main(String args[])
	{
		first f1=new first(27,7,1997);
		first f3=new first();
		first f2=new first(f3);
		f1.show();
		f2.show();
		f3.show();
	}
}
