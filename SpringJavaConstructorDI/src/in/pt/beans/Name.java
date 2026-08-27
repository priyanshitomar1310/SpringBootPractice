package in.pt.beans;

public class Name 
{
	private String FirstName;
	private String MiddleName;
	private String LastName;
	public Name(String FirstName,String MiddleName,String LastName)
	{
		this.FirstName=FirstName;
		this.MiddleName=MiddleName;
		this.LastName=LastName;
	}
	 
	@Override
	public String toString()
	{
		return FirstName +MiddleName + LastName;
	}
}
