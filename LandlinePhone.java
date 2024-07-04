class LandlinePhone{

    public static void main(String[] telephoneRinger){
	    System.out.println("Main Started");
		fetchFeatures();
		System.out.println("Main Ended");
		
	}
	
	public static void fetchFeatures(){
	    System.out.println("fetchFeatures method started");
		String brandName = "Praxon" ;
		int price = 886 ;
		String material = "ABS plastic" ;
		String color = "Multi-Color" ;
		String telephoneType = "Corded" ;
	    String numberOfBatteries = "1 9V batteries required." ;
		
		System.out.println("The Brand Name is " + brandName);
		System.out.println("The Price is " + price);
		System.out.println("The Material is " + material);
		System.out.println("The Color is " + color);
		System.out.println("The Telephone Type is " + telephoneType);
		System.out.println("The Number of Batteries is " + numberOfBatteries);
		System.out.println("fetchFeatures method ended");
		return;
		
	}
	
}