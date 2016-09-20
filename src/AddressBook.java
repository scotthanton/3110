import java.util.ArrayList;

public class AddressBook {

	protected ArrayList<BuddyInfo> arrCollection;
	
	public AddressBook() {
		arrCollection = new ArrayList<BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo b) {
		if (b != null)
			this.arrCollection.add(b);
	}
	
	public void removeBuddy(int index) {
		if (index >= 0 && index < this.arrCollection.size())
			this.arrCollection.remove(index);
	}
	
	public static void main(String[] args) {
		System.out.println("Address Book");
	}
	
}
