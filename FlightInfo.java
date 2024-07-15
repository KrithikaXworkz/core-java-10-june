class FlightInfo{
    
    public static int getFlightPriceByDestinationName(String destinationName){
	
	    int flightPrice = 0 ;
		if(destinationName == "Mumbai"){
		   flightPrice = 4000 ;
		   return flightPrice ;
		}
		if(destinationName == "Bangalore"){
		   flightPrice = 5242 ;
		   return flightPrice ;
		}
		if(destinationName == "Pune"){
		    flightPrice = 4047 ;
			return flightPrice ;
		}
		if(destinationName == "Srinagar"){
		    flightPrice = 4902 ;
			return flightPrice ;
		}
		if(destinationName == "Dubai"){
		    flightPrice = 8241 ;
			return flightPrice ;
		}
		if(destinationName == "Toronto"){
		    flightPrice = 78216 ;
			return flightPrice ;
		}
		if(destinationName == "Bangkok"){
		    flightPrice = 10229 ;
			return flightPrice ;
		}
		if(destinationName == "London"){
		    flightPrice = 26340 ;
			return flightPrice ;
		}
		if(destinationName == "Chennai"){
		    flightPrice = 32000 ;
			return flightPrice ;
		}
		if(destinationName == "America"){
		    flightPrice = 50000 ;
			return flightPrice ;
		}
		if(destinationName == "Ahmedabad"){
		   flightPrice = 15000 ;
		   return flightPrice ;
	    }
		if(destinationName == "Kolkata"){
		    flightPrice = 5609 ;
			return flightPrice ;
		}
		if(destinationName == "Sydney"){
		    flightPrice = 17526 ;
			return flightPrice ;
		}
		if(destinationName == "Doha"){
		    flightPrice = 9161 ;
			return flightPrice ;
		}
		if(destinationName == "Zurich"){
		    flightPrice = 25112 ;
			return flightPrice ;
		}
		if(destinationName == "Moscow"){
		    flightPrice = 25221 ;
			return flightPrice ;
		}
		if(destinationName == "Lucknow"){
		    flightPrice = 5188 ;
			return flightPrice ;
		}
		if(destinationName == "Patna"){
			flightPrice = 19800 ;
			return flightPrice ;
		}
		if(destinationName == "Paris"){
			flightPrice = 26200 ;
			return flightPrice ;
		}
		if(destinationName == "Istanbul"){
			flightPrice = 17913 ;
			return flightPrice ;
		}
		else{
		    System.out.println(destinationName + " not found ");
		}
		
		return flightPrice ;
		
	}
	
}