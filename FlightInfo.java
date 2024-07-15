class FlightInfo{
    
    public static int getFlightPriceByDestinationName(String destinationName){
	
	    int flightPrice = 0 ;
		if(destinationName == "Mumbai") return flightPrice = 4000 ;
	    if(destinationName == "Bangalore") return flightPrice = 5242 ;
		if(destinationName == "Pune") return flightPrice = 4047 ;
	    if(destinationName == "Srinagar") return flightPrice = 4902 ;
        if(destinationName == "Dubai") return flightPrice = 8241 ;
		if(destinationName == "Toronto") return flightPrice = 78216 ;
		if(destinationName == "Bangkok") return flightPrice = 10229 ;
		if(destinationName == "London") return flightPrice = 26340 ;
		if(destinationName == "Chennai") return flightPrice = 32000 ;
		if(destinationName == "America") return flightPrice = 50000 ;
		if(destinationName == "Ahmedabad") return flightPrice = 15000 ;
	    if(destinationName == "Kolkata") return flightPrice = 5609 ;
		if(destinationName == "Sydney") return flightPrice = 17526 ;
        if(destinationName == "Doha") return flightPrice = 9161 ;
		if(destinationName == "Zurich") return flightPrice = 25112 ;
		if(destinationName == "Moscow") return flightPrice = 25221 ;
	    if(destinationName == "Lucknow") return flightPrice = 5188 ;
		if(destinationName == "Patna") return flightPrice = 19800 ;
		if(destinationName == "Paris") return flightPrice = 26200 ;
		if(destinationName == "Istanbul") return flightPrice = 17913 ;
		else{
		    System.out.println(destinationName + " not found ");
		}
		
		return flightPrice ;
		
	}
	
}