class Fridge{

    static boolean isConnected = false ;
	
	public static void switchOn(){
	
	    System.out.println("start of switchOn");
		if(isConnected == false){
		    isConnected = true ;
			System.out.println("The Fridge is Switch on...");
		}
		System.out.println("end of switchOn");
		return;
		
	}
	
	public static void switchOff(){
	    
		System.out.println("start of switchOff");
		if(isConnected == true){
		    isConnected = false ;
			System.out.println("The Fridge is Switch off...");
		}
		System.out.println("end of switchOff");
		return;
		
	}
	
}