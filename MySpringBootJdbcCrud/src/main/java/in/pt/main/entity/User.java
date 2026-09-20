package in.pt.main.entity;

public class User 
{
	private int UserId;
	private String name;
	private String EmailId;
	private int age;
	public User(){}
	
	public User(int UserId,String name,String EmailId,int age)
	{
		this.UserId=UserId;
		this.name=name;
		this.EmailId=EmailId;
		this.age=age;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
