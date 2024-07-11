class Fridge{

    static boolean isConnected = false ;
	//static int maxTemp = 7 ;
	//static int currentTemp ;
	//static int minTemp = 0 ;
	
	
	public static boolean onOrOff(){
	
	    System.out.println("start of onOrOff");
		
		isConnected = (isConnected == true) ? false : true ;
		
		/*if(isConnected == false){
		    isConnected = true ;
		}else if(isConnected == true){
		    isConnected = false ;
		}*/
		
		
		System.out.println("end of onOrOff");
		return isConnected;
		
	}
	       //nested-if Condition
	/*public static void increaseTemp(){
		System.out.println("increaseTemp method started");
		if(isConnected = true){
			if(currentTemp < maxTemp){
				currentTemp = currentTemp + 1 ;
				System.out.println("The currentTemp of Fridge is :" + currentTemp);
			}else 
				System.out.println("Maximum Temperature Reached");
		    }else
				System.out.println("Turn on the Fridge");
			System.out.println("increaseTemp method ended");
			return ;
	}
	       //nested-if Condition
	public static void decreaseTemp(){
		System.out.println("decreaseTemp method started");
		if(isConnected = true){
			if(currentTemp > minTemp){
				currentTemp = currentTemp - 1 ;
				System.out.println("The currentTemp of Fridge is :" + currentTemp);
			}else 
				System.out.println("Minimum Temperature Reached");
		    }else
				System.out.println("Turn on the Fridge");
			System.out.println("decreaseTemp method ended");
			return ;
	}*/
	
}
	