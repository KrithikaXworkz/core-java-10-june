class Mic{

    public static void main(String[] nesa){
	    System.out.println("Main Started");
		fetchFeatures();
		System.out.println("Main Ended");
		
	}
	
	public static void fetchFeatures(){
	    System.out.println("fetchFeatures method started");
		String brandName = "NESA" ;
		int price = 1099 ;
		String modelName = "MUD-59XLR" ;
		String recommendedUsesForProduct = "Singing, Karoke" ;
		String connectivityTechnology = "XLR" ;
		String connectorType = "XLR" ;
		
		System.out.println("The Brand Name is " + brandName);
		System.out.println("The Price is " + price);
		System.out.println("The Model Name is " + modelName);
		System.out.println("The Recommended Uses For product is " + recommendedUsesForProduct);
		System.out.println("The Connectivity Technology is " + connectivityTechnology);
		System.out.println("The Connector Type is " + connectorType);

		System.out.println("fetchFeatures method ended");
		return;
		
	}
	
}