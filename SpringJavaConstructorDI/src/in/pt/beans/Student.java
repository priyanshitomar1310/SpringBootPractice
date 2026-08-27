package in.pt.beans;


public class Student 
{
	private Name FullName;
	private int age;
	private int classes;
	private String email;
	public Student(Name FullName,int age,int classes,String email)
	{
		this.FullName=FullName;
		this.age=age;
		this.classes=classes;
		this.email=email;
	}
	public void display()
	{
		System.out.println("Th Student name is "+FullName+" of "+age+" years old and in "+classes+" class and its email id is "+ email);
	}
}
