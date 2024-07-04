class Wallet{

    public static void main(String[] purse){
	    System.out.println("Main Started");
		getFeatures();
		System.out.println("Main Ended");
		
	}
	
	public static void getFeatures(){
	    System.out.println("getFeatures method started");
		String modelName = "KrosshornKWRF15034";
		int price = 229 ;
        String bagSize = "Regular Size" ;
        String salesPackage = "1 RFID Protected Texan Leatherite Leather Wallet" ;
        int numberOfCardSlots = 8 ;
        String material = "Artificial Leather" ;
        String color = "Black" ;
		
		System.out.println("The Model Name is " + modelName);
		System.out.println("The Price is " + price);
		System.out.println("The Bag Size is " + bagSize);
		System.out.println("The Sales Package is " + salesPackage);
		System.out.println("The Number of Card Slots is " + numberOfCardSlots);
		System.out.println("Th Material is " + material);
		System.out.println("The Color is " + color);
		
		System.out.println("getFeatures method ended");
		return;
		
	}
	
}