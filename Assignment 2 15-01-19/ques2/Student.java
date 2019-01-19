import java.util.Scanner;
class Student
{
	private int admno;
	private String name;
	private float marksEng;
	private float marksMaths;
	private float marksSci;
	private float total;
	
	public void compute()
	{
		total = marksEng + marksMaths + marksSci;
	}
	public void readData(int admno,String name,float marksEng,float marksMaths, float marksSci)
	{
		this.admno = admno;
		this.name = name;
		this.marksEng = marksEng;
		this.marksMaths = marksMaths;
		this.marksSci = marksSci;
		compute();
	}
	
	public void showData()
	{
		System.out.println("Admission number: "+admno);
		System.out.println("Name: " + name);
		System.out.println("Marks in English: "+ marksEng);
		System.out.println("Marks in Maths: "+ marksMaths);
		System.out.println("Marks in Science: "+ marksSci);
		System.out.println("Total marks: "+ total);
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter admission number");
		int adm_num = sc.nextInt();
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter marks in English");
		float marks_e = sc.nextFloat();
		System.out.println("Enter marks in Maths");
		float marks_m = sc.nextFloat();
		System.out.println("Enter marks in Science");
		float marks_s = sc.nextFloat();
		Student st = new Student();
		st.readData(adm_num,name,marks_e,marks_m,marks_s);
		st.showData();
	}
	
}
