package testing;

public class test {

	public static void main(String[] args) {
		SalesData data = new SalesData();
		
		displayGreeting();
		data.display();
	}
	
	private static void displayGreeting() {
		System.out.println("Hello Happy Sales People");
		System.out.println("This App Shows Sales Data");
	}

}
