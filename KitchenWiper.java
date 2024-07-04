class KitchenWiper{

    public static void main(String[] scotchBrite){
	    System.out.println("Main Started");
		fetchFeatures();
		System.out.println("Main Ended");
		
	}
	
	public static void fetchFeatures(){
	    System.out.println("getFeatures method started");
		String brandName = "Scotch-Brite" ;
		int price = 150 ;
		String style = "Modern" ;
		String color = "Grey" ;
		String itemWeight = "113 grams" ;
		String productDimensions = "15.7W x 24.9H Centimeters" ;
		
		System.out.println("The Brand Name is " + brandName);
		System.out.println("The Price is " + price);
		System.out.println("The Style is " + style);
		System.out.println("The Color is " + color);
		System.out.println("The Item Weight is " + itemWeight);
		System.out.println("The Product Dimensions is " + productDimensions);

		System.out.println("getFeatures method ended");
		return;
		
	}
	
}