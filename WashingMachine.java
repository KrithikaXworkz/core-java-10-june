class WashingMachine{

    public static void main(String[] reliance){
	    System.out.println("Main Started");
		getFeatures();
		System.out.println("Main Ended");
		
	}
	
	public static void getFeatures(){
	    System.out.println("getFeatures method started");
	    String brandName = "Samsung" ;
		int price = 15690 ;
	    String capacity = "7 kg";
		String specialFeature = "Inverter" ;
		String productDimensions = "54D x 56.8W x 92.6H Centimeters" ;
		String accessLocation = "TopLoad" ;
		
		System.out.println("The Brand Name is " + brandName);
		System.out.println("The Price is " + price);
		System.out.println("The Capacity is " + capacity);
		System.out.println("The Special Feature is " + specialFeature);
		System.out.println("The Product Dimensions is " + productDimensions);
		System.out.println("The Access Location is " + accessLocation);
		System.out.println("getFeatures method ended");
		return;
		
	}
	
}