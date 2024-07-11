class DigitalElectronicSafeLocker{

    static boolean isConnected = false ;
	static int maxSpeed = 7 ;
	static int minSpeed = 0 ;
	static int currentSpeed ;
	
	public static boolean onOrOff(){
	
	    System.out.println("start of onOrOff");
		if(isConnected == false){
		    isConnected = true ;
		}else if(isConnected == true){
		    isConnected = false;
		}
		System.out.println("end of onOrOff");
		return isConnected;
	}

    public static void increaseSpeed(){
		System.out.println("increaseSpeed method started");
		if(isConnected == true){
			if(currentSpeed < maxSpeed){
				currentSpeed = currentSpeed + 1 ;
				System.out.println("The currentSpeed of Fridge is :" + currentSpeed);
			}else 
				System.out.println("Minimum Speed Reached");
		    }else
				System.out.println("Turn on the Fridge");
		System.out.println("increaseSpeed method ended");
		return;
	}	
	
	public static void decreaseSpeed(){
		System.out.println("decreaseSpeed method started");
		if(isConnected == true){
			if(currentSpeed > minSpeed){
				currentSpeed = currentSpeed - 1 ;
				System.out.println("The currentSpeed of Fridge is :" + currentSpeed);
			}else 
				System.out.println("Maximum Temperature Reached");
		    }else
				System.out.println("Turn on the Fridge");
		System.out.println("decreaseSpeed method ended");
		return;
	}
}