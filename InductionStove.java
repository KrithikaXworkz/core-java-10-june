class InductionStove{
       
	static boolean isConnected = false ;
	//static int maxTemp = 6 ;
	//static int currentTemp ;
	//static int minTemp ;
		
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
			
			//nested-if condition
		/*public static void increaseTemp(){
			
			System.out.println("start of increaseTemp");
			    if(isConnected == true){
					if(currentTemp < maxTemp){
					currentTemp = currentTemp + 1 ;
					System.out.println("The currentTemp of InductionStove is :" + currentTemp);
				}else 
					System.out.println("Maximum Temperature Reached");
		        }else
					System.out.println("Turn on Induction Stove");
			System.out.println("end of increaseTemp");
			return;
		}
         
		 //nested-if Condition
        public static void decreaseTemp(){
		
		System.out.println("Start of decreaseTemp");
			if(isConnected == false){
				if(currentTemp > minTemp){
					currentTemp = currentTemp - 1;
					System.out.println("Current Temp is "+ currentTemp);
				}else System.out.println("Minimum Temp reached");
			}else System.out.println("Turn on the InductionStove ");
		System.out.println("End of decreaseTemp method");
	return;
		}*/		
}

