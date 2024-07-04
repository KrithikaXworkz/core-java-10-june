class LunchBox{

    public static void main(String[] signoraWare){
	    System.out.println("Main Started");
		getFeatures();
		System.out.println("Main Ended");
		
	}
	
	public static void getFeatures(){
	    System.out.println("getFeatures method started");
		String brandName = "SignoraWare" ;
		int price = 349 ;
		String capacity = "850 millimeters" ;
		String material = "Plastic" ;
		String color = "T Blue" ;
		String ageRange = "Adult" ;
		String specialFeature = "insulated, microwave_safe, freezer_safe, dishwasher_safe" ;
	    String pattern = "Solid" ;
		String itemWeights = "380 grams" ;
		String productCareInstructions = "Hand Wash Only, Dishwasher Safe" ;
		
		System.out.println("The Brand Name is " + brandName);
		System.out.println("The Price is " + price);
		System.out.println("The Capacity is " + capacity);
		System.out.println("The Material is " + material);
		System.out.println("The Age Range is " + ageRange);
		System.out.println("The Special Feature is " + specialFeature);
		System.out.println("The Pattern is " + pattern);
		System.out.println("The Item Weights is " + itemWeights);
		System.out.println("The Product Care Instructions is " + productCareInstructions);

		System.out.println("getFeatures method ended");
		return;
		
	}
	
}