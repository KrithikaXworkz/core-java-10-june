class StandHolder{

    public static void main(String[] tygot){
	    System.out.println("Main Started");
		fetchFeatures();
		System.out.println("Main Ended");
		
	}
	
	public static void fetchFeatures(){
	    System.out.println("fetchFeatures method started");
		String brandName = "Tygot" ;
		int price = 349 ;
		String compatibleDevics = "Camcorder, Camera, Smartphone" ;
		String material = "Aluminium" ;
		String color = "Black" ;
		String specialFeatures = "Lightweight, Includes Cover" ;
		
		System.out.println("The Brand Name is " + brandName);
		System.out.println("The Price is " + price);
		System.out.println("The Compatible Devices is " + compatibleDevics);
		System.out.println("The Material is " + material);
		System.out.println("The Color is " + color);
		System.out.println("The Special Features is " + specialFeatures);

		System.out.println("fetchFeatures method ended");
		return;
		
	}
	
}