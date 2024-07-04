class VinegarBottle{

    public static void main(String[] dhananjay){
	    System.out.println("Main Started");
		fetchFeatures();
		System.out.println("Main Ended");
		
	}
	
	public static void fetchFeatures(){
	    System.out.println("getFeatures method started");
		String brandName = "D Dhananjay" ;
		int price = 99 ;
		String capacity = "1000 millimeters" ;
		String material = "Plastic" ;
		String color = "1000 ml Oval" ;
		String bottleType = "Standard Bottle" ;
		
		System.out.println("The Brand Name is " + brandName);
		System.out.println("The Price is " + price);
		System.out.println("The Capacity is " + capacity);
		System.out.println("The Material is " + material);
		System.out.println("The Color is " + color);
		System.out.println("The Bottle Type is " + bottleType);

		System.out.println("getFeatures method ended");
		return;
		
	}
	
}