package Lab3;

public class BuddyInfo 
{
	private String name;
	private String address;
	private String phoneNumber;
	private boolean isBestFriend;
	public BuddyInfo(String name, String address, String phoneNumber, boolean isBestFriend)
	{
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.isBestFriend = isBestFriend;
		
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	public boolean isBestFriend()
	{
		return isBestFriend;
	}
	public void setBestFriend(boolean isBestFriend)
	{
		this.isBestFriend = isBestFriend;
	}
}