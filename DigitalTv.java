class DigitalTv{

    public static void main(String[] airtel){
	    System.out.println("Main Started");
		fetchFeatures();
		System.out.println("Main Ended");
		
	}
	
	public static void fetchFeatures(){
	    System.out.println("getFeatures method started");
		String brandName = "Airtel Digital TV" ;
		int price = 1847 ;
		String compatibleDevices = "Television" ;
		String connectorType = "HDMI" ;
		String color = "Black" ;
		String itemDimensions = "12x6x3 Centimeters" ;
		
		System.out.println("The Brand Name is " + brandName);
		System.out.println("The Price is " + price);
		System.out.println("The Compatible Devices is " + compatibleDevices);
		System.out.println("The Connector Type is " + connectorType);
		System.out.println("The Color is " + color);
		System.out.println("The Item Dimensions is " + itemDimensions);

		System.out.println("getFeatures method ended");
		return;
		
	}
	
}