class IronBox{

    static boolean isConnected = false ;
	static int maxTemp = 5 ;
	static int currentTemp ;
	static int minTemp = 4 ;
	
	
	public static boolean onOrOff(){
	
	    System.out.println("start of onOrOff");
		
		    if(isConnected == false){
			    isConnected = true ;
			}else if(isConnected == true){
			    isConnected = false ;
			}
		System.out.println("end of switchOn");
		return isConnected;
		
	}
	
	public static void increaseTemp(){
		
		System.out.println("increaseTemp method started");
		if(isConnected == true){
			if(currentTemp < maxTemp){
				currentTemp = currentTemp + 1 ;
				System.out.println("The currentTemp of IronBox is :" + currentTemp);
			}else System.out.println("Maximum Temperature Reached");
		}else System.out.println("Turn on the Iron Box");
		System.out.println("increaseTemp method ended");
		return;
	}
	
	public static void decreaseTemp(){
		
		System.out.println("decreaseTemp method started");
		if(isConnected == true){
			if(currentTemp > minTemp){
				currentTemp = currentTemp - 1 ;
				System.out.println("The currentTemp of IronBox is :" + currentTemp);
			}else System.out.println("Minimum Temperature Reached");
		}else System.out.println("Turn on the Iron Box");
		System.out.println("decreaseTemp method ended");
		return;
	}
}