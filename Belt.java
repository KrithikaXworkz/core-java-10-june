class Belt{

    public static void main(String[] nylonBelt){
	    System.out.println("Main Started");
		getFeatures();
		System.out.println("Main Ended");
		
	}
	
	public static void getFeatures(){
	    System.out.println("getFeatures method started");
		String modelName = "Indian Army Belt" ;
		String type = "Army Green Nylon Belt" ;
		int price = 264 ;
		String size ="One Size" ;
		int widthInInches = 2 ;
		String color = "Green" ;
		String material ="Nylon" ;
		int netQuantity = 1 ;
		
		System.out.println("The Model Name is " + modelName);
		System.out.println("The Type is " + type);
		System.out.println("The Price of Belt is " +price);
		System.out.println("The Size is " + size);
		System.out.println("The Width of the Belt is " + widthInInches);
		System.out.println("The Color of the Belt is " + color);
		System.out.println("The Material is " + material);
		System.out.println("The Net Quantity is " +netQuantity);
		System.out.println("getFeatures method ended");
		return;
		
	}
	
}