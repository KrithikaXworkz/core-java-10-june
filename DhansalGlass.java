class DhansalGlass{

    public static void main(String[] glass){
	    System.out.println("Main Started");
		getFeatures();
		System.out.println("Main Ended");
		
	}
	
	public static void getFeatures(){
	    System.out.println("getFeatures method started");
		String modelName = "Crystal Whiskey Glass Set" ;
		int price = 499 ;
		String suitableFor = "Club, Bar" ;
		String otherFeatures = "Microwave Safe" ;
		int salesPackage = 1 ;
        int netQuantity = 6 ;
		
		System.out.println("The Model Name is " +modelName);
		System.out.println("The Price is " + price);
		System.out.println("This Glass will Suitable for " + suitableFor);
		System.out.println("The Other Features is " + otherFeatures);
		System.out.println("The Sales Package is  " + salesPackage);
		System.out.println("The Net Quantity is " + netQuantity);
		
		System.out.println("getFeatures method ended");
		return;
		
	}
	
}