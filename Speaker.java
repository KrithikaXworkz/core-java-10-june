class Speaker{
     
	static boolean isConnected = false ;
	static int maxVolume = 7 ;
	static int minVolume = 0 ;
	static int currentVolume ;

       //method declaration
        public static boolean onOrOff(){
			 
			System.out.println("start of onOrOff");
			
			//ternary operators
			//ref = condition ? value 1 :value 2 ;
			isConnected = (isConnected == false) ? true : false ;
			
			
			/*if(isConnected == false){
				isConnected = true ;
			}else if(isConnected == true){
				isConnected = false ;
			}*/
			
			/*if(!isConnected) isConnected = true ;
			else if(isConnected) isConnected = false ;*/
			
			
		    /*if(!isConnected){
				isConnected = true ;
			}else if(!isConnected){
				isConnected = false ;
			}*/
			
			
			/*if(isConnected == false){
				isConnected = true ;
			}else{
				isConnected = false ;
			}*/
			
			
			System.out.println("end of onOrOff");
	    return isConnected;
	    }

		public static void increaseVolume(){
			System.out.println("start of increaseVolume");
			if(isConnected = true){
				if(currentVolume < maxVolume){
					currentVolume = currentVolume + 1 ;
					System.out.println("The Current Volume of Speaker is :" + currentVolume);
				}else
					System.out.println("Maxmum Temperature Reached");
			}else
				System.out.println("Turn on Speaker");
			System.out.println("end of increaseVolume");
			return;
		}
		
		public static void decreaseVolume(){
			System.out.println("start of decreaseVolume");
			if(isConnected = true){
				if(currentVolume > minVolume){
					currentVolume = currentVolume - 1 ;
					System.out.println("The Current Volume of the Speaker is :" + currentVolume);
				}else
					System.out.println("Minimum Volume Reached");
			}else
				System.out.println("Turn on the Speaker");
			return;
		}
}

	
	    
		/*public static void turnOff(){
			
			System.out.println("start of turnOff");
			
			if(isConnected == true){
				isConnected = false ;
				System.out.println("The Speaker is Turned off...");
			}
			    System.out.println("end of turnOff");
		return;
		}*/
