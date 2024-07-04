class CeilingFan{

    public static void main(String[] fan){
	    System.out.println("Main Started");
		getFeatures();
		System.out.println("Main Ended");
		
	}
	
	public static void getFeatures(){
	    System.out.println("getFeatures method started");
		String modelName = "Energion Hyperjet" ;
		int price = 2499 ;
		String color = "Brown" ;
		int numberOfBlades = 3 ;
		String powerConsumption = "35 W" ;
		String bladeMaterial = "Aluminium" ;
		
		System.out.println("The Model Name is " + modelName);
		System.out.println("The Price is " + price);
		System.out.println("The Color is " + color);
		System.out.println("The Number of Blades is " + numberOfBlades);
		System.out.println("The Power Consumption is " + powerConsumption);
		System.out.println("The Blade Material is " + bladeMaterial);
		
		System.out.println("getFeatures method ended");
		return;
		
	}
	
}