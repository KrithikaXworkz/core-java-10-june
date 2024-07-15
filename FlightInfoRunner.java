class FlightInfoRunner{

    public static void main(String[] args){
	 
	    System.out.println("Main Started");
		String destinationName = "London" ;
		int price = FlightInfo.getFlightPriceByDestinationName(destinationName);
		System.out.println("Flight Destination Name is " + destinationName);
		System.out.println("The Price of Flight is : " + price);
		System.out.println("Main Ended");
	}
	
}