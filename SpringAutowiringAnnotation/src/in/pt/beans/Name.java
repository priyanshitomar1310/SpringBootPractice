package in.pt.beans;

public class Name 
{
	private String FirstName;
	private String MiddleName;
	private String LastName;
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	@Override
	public String toString()
	{
		return FirstName+MiddleName+LastName;
	}
}
