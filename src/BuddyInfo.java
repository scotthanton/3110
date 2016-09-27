
public class BuddyInfo {

	protected String name;
	
	public static void main(String[] args) {
		
		BuddyInfo b = new BuddyInfo("Scott");
		System.out.println("Hello " + b.getName());
		
	}
	
	public BuddyInfo(String name) {
		this.setName(name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

}
