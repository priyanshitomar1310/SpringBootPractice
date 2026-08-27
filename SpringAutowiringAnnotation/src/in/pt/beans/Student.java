package in.pt.beans;

public class Student 
{
//	Setter method Dependency Injection
	private Name name;
	private int age;
	private int classes;
	private String email;
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getClasses() {
		return classes;
	}
	public void setClasses(int classes) {
		this.classes = classes;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void display()
    {
    	System.out.println("Student name is "+name+" of  "+age+" years old and in class "+classes+"and its email id is "+email);
    }
	
}
