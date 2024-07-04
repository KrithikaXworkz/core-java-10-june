class HeadPhones{

    public static void main(String[] bluetooth){
	    System.out.println("Main Started");
		getFeatures();
		System.out.println("Main Ended");
		
	}
	
	public static void getFeatures(){
	    System.out.println("getFeatures method started");
		String brandName = "boAt" ;
		int price = 1699 ;
	    String color = "Luscious Black" ;
		String earPlacement = "On Ear" ;
		String formFactor = "On Ear" ;
		String impedance = "16 ohm" ;
		
		System.out.println("The Brand Name is " + brandName);
		System.out.println("The Price is " + price);
		System.out.println("The Color is " + color);
		System.out.println("The Ear Placement is " + earPlacement);
		System.out.println("The Form Factor is " + formFactor);
		System.out.println("The Impedance is " + impedance);
		System.out.println("getFeatures method ended");
		return;
		
	}
	
}