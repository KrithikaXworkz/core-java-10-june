class EarBuds{

    static boolean isConnected = false ;
	static int maxVolume = 5 ;
	static int currentVolume ;
	static int minVolume = 0 ;
		
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
            //nested-if condition
        public static void increaseVolume(){
			System.out.println("increasevolume method started");
			if(isConnected == true){
				if(currentVolume < maxVolume){
					currentVolume = currentVolume + 1 ;
					System.out.println("The currentVolume of Ear Buds is :" + currentVolume);
				}else
					System.out.println("Maximum Volume Reached");
			}else
				System.out.println("Turn on the Ear Buds");
			System.out.println("increaseVolume method ended");
			return;
		}	

        public static void decreaseVolume(){
		
		System.out.println("Start of decreaseVolume");
			if(isConnected == true){
				if(currentVolume > minVolume){
					currentVolume = currentVolume - 1;
					System.out.println(" The currentVolume is "+ currentVolume);
				}else System.out.println("MinimumVolume reached");
			}else System.out.println("Turn on Ear Buds");
		System.out.println("End of decreaseVolume");
	return;
		}		
		
		
}