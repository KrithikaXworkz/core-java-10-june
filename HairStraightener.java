class HairStraightener{
    
	static boolean isConnected = false ;
	static int maxTemp = 6 ;
	static int currentTemp ;
	static int minTemp  ;
	
        public static boolean onOrOff(){
		
		    System.out.println("start of onOrOff");
			if(isConnected == false){
			    isConnected = true ;
			}else if(isConnected == true){
			    isConnected = false ;
			}
			System.out.println("end of onOrOff");
			return isConnected;
			
	    }
	    public static void increaseTemp(){
		System.out.println("Start of increaseTemp method");
	
			if(isConnected = true){
				if(currentTemp < maxTemp){
					currentTemp = currentTemp + 1;
					System.out.println("Current Temp is "+ currentTemp);
				}else System.out.println("Maximum Temp reached");
			}else System.out.println("Turn on the Hair Straightener");

		System.out.println("End of increase Temp method");
	return;
	}
	public static void decreaseTemp(){
		System.out.println("Start of decrease Temp method");
			if(isConnected = true){
				if(currentTemp > minTemp){
					currentTemp = currentTemp - 1;
					System.out.println("Current Temp is "+ currentTemp);
				}else System.out.println("Minimum Temp reached");
			}else System.out.println("Turn on the Hair Straightener ");
		System.out.println("End of decrease Temp method");
	return;
	}
}

