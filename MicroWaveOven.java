class MicroWaveOven{

    public static void main(String[] panasonic){
	    System.out.println("Main Started");
		fetchFeatures();
		System.out.println("Main Ended");
		
	}
	
	public static void fetchFeatures(){
	    System.out.println("getFeatures method started");
		String brandName = "Panasonic" ;
		int price = 5690 ;
		String capacity = "20 litres" ;
		String color = "Black" ;
		String specialFeature = "Auto-Cook" ;
		String productDimensions = "34D x 44W x 26H Centimeters" ;
		
		System.out.println("The Brand Name is " + brandName);
		System.out.println("The Price is " + price);
		System.out.println("The Capacity is " + capacity);
		System.out.println("The Color is " + color);
		System.out.println("The Special Feature is " + specialFeature);
		System.out.println("The Product Dimensions is " + productDimensions);

		System.out.println("getFeatures method ended");
		return;
		
	}
	
}