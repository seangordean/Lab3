package Lab3;

import java.util.ArrayList;
import java.util.Iterator;

//import ArrayList;
public class AddressBook 
{
	private ArrayList<BuddyInfo> buddyList = new ArrayList<BuddyInfo>();
	public static void main (String[] args)
	{
		BuddyInfo steve = new BuddyInfo("Steve", "232 road", "613-613-613", false);
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(steve);
		addressBook.removeBuddy(steve.getName());
		
	}

	private void addBuddy(BuddyInfo buddy)
	{
		buddyList.add(buddy);
		System.out.println("Buddy added");
	}
	
	private void removeBuddy(String name)
	{
		Iterator<BuddyInfo> iter = buddyList.iterator();
		BuddyInfo buddy = iter.next(); 
		while (iter.hasNext())
		{
			System.out.println(iter.hasNext());
			if (buddy.getName().equals(name))
			{
				buddyList.remove(buddy);			
			}
		}
		System.out.println("Buddy removed");
	}
}
