package in.pt.beans;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
@Component
public class Student 
{
	@Value("Priyanshi Tomar")
	private String name;
	@Value("134")
	private int rollno;
	@Value("98.4f")
	private float marks;
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getRollno() 
	{
		return rollno;
	}
	public void setRollno(int rollno) 
	{
		this.rollno = rollno;
	}
	public float getMarks() 
	{
		return marks;
	}
	public void setMarks(float marks) 
	{
		this.marks = marks;
	}
	public void display()
    {
    	System.out.println("My name is "+name+" with roll number "+rollno+" having marks "+marks);
    }
}
