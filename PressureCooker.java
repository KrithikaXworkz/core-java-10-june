class PressureCooker{

    public static void main(String[] pigeon){
	    System.out.println("Main Started");
		getFeatures();
		System.out.println("Main Ended");
		
	}
	
	public static void getFeatures(){
	    System.out.println("getFeatures method started");
	    String brandName = "Pigeon" ;
		int price = 1789 ;
		String capacity = "5 litres" ;
		String material = "Titanium,Aluminium" ;
		String color = "Black" ;
		String finishType = "Titanium" ;
	    String productDimensions = "10.2D x 16.9W x 7.5H Centimeters" ;
		
		System.out.println("The Brand Name is " + brandName);
		System.out.println("The Price is " + price);
		System.out.println("The Capacity is " + capacity);
		System.out.println("The Material is " + material);
		System.out.println("The Color is " + color);
		System.out.println("The Finish Type is " + finishType);
		System.out.println("The Product Dimensions is " + productDimensions);
		System.out.println("getFeatures method ended");
		return;
		
	}
	
}