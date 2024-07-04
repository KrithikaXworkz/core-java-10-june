class Calculator{

    public static void main(String[] casioMg){
	    System.out.println("Main Started");
		getFeatures();
		System.out.println("Main Ended");
		
	}
	
	public static void getFeatures(){
	    System.out.println("getFeatures method started");
		String brandName = "Casio" ;
		int price = 440 ;
		String color = "Grey" ;
		String calculatorType = "Bussiness" ;
		String powerSource = "Solar Powered" ;
		String screenSize = "7 Inches" ;
		
		System.out.println("The Brand Name is " + brandName);
		System.out.println("The Price is " + price);
		System.out.println("The Color is " + color);
		System.out.println("The Calculator Type is " + calculatorType);
		System.out.println("The Power Source is " + powerSource);
		System.out.println("The Screen Size is " + screenSize);

		System.out.println("getFeatures method ended");
		return;
		
	}
	
}