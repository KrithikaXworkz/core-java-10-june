class FlightInfoRunner{

    public static void main(String[] args){
	 
	    System.out.println("Main Started");
		String destinationName = "London" ;
		int quantity = 5 ;
		int price = FlightInfo.getFlightPriceByDestinationName(destinationName);
		System.out.println("Flight Destination Name is " + destinationName);
		System.out.println("Quantity of Flight Information is " + quantity);
		System.out.println("The Price of Flight is : " + price*quantity);
		System.out.println("Main Ended");
	}
	
}

/*class AirtelPlanRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
			String internetPackName = "Ultra Max 9GB";
			int noPackPurchase = 3;
			double priceOfPack = AirtelPlan.findInternetPack(internetPackName);
			System.out.println("Pack name is " + internetPackName);
			System.out.println("Number of Pack Purchase " + noPackPurchase);
			System.out.println("Total price is " + noPackPurchase*priceOfPack);
		System.out.println("Main Ended");
	}
}*/