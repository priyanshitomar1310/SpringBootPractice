package in.pt.beans;


public class Student 
{
	private Name FullName;
	private int age;
	private int classes;
	private String email;
	public void setFullName(Name fullName) {
		FullName = fullName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setClasses(int classes) {
		this.classes = classes;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void display()
	{
		System.out.println("Th Student name is "+FullName+" of "+age+" years old and in "+classes+" class and its email id is "+ email);
	}
}
